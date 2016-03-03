if [ "$#" -eq 0 ]; then
        echo "Usage: ./run_all.sh <server name> <input folder> <ES doc type> <index prefix>" 
        exit 1
fi

# create all possible index combinations
for i in "ll" "spl"; do
    for j in "df" "ttf"; do
        for k in "no" "h1" "h2" "h3" "z"; do
           #echo "k1="$k1",b="$b",overlap="$k
           final_index_name=$4"_"$i"_"$j"_"$k
           #echo $final_index_name
	         curl -XDELETE $1:9200/$final_index_name
          #echo "$1:9200/$final_index_name"
	        #echo "Sim: $2"
          curl -XPUT $1:9200/$final_index_name -d '{ "settings": { "similarity": { "ib_similarity" : { "type": "IB", "distribution": "'$i'", "lambda": "'$j'", "normalization": "'$k'"} } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "ib_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'

          ./read.sh $2 "$final_index_name/$3" wjk 4 true

           dfs="-f"
            output=results_dfr_$dfs
            mkdir $output
            #echo "java -jar tools/checker.jar -s $1 -i $final_index_name -t src -d $3 -l $i $ngram_flag $k 1> $output/$final_index_name.csv"
            java -jar tools/checker.jar -s $1 -i $final_index_name -t $3 -d $2 -l wjk -n $dfs 1> $output/$final_index_name.csv
            curl -XDELETE $1:9200/$final_index_name
        done
    done
done