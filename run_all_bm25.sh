if [ "$#" -eq 0 ]; then
        echo "Usage: ./run_all.sh <server name> <input folder> <ES doc type> <index prefix>" 
        exit 1
fi

# create all possible index combinations
for i in "0.0" "0.6" "1.2" "1.8" "2.4"; do
    for j in "0.0" "0.25" "0.50" "0.75" "1.00"; do
        for k in "true" "false"; do
#           k1=`echo $i | sed -e s:\\\\.::`
#           b=`echo $j | sed -e s:\\\\.::` 
#           #echo "k1="$k1",b="$b",overlap="$k
            final_index_name=$4"_"$k1"_"$b"_"$k
#           #echo $final_index_name
            curl -XDELETE $1:9200/$final_index_name
#           #echo "$1:9200/$final_index_name"
            #echo "Sim: $2"
            curl -XPUT $1:9200/$final_index_name -d '{ "settings": { "similarity": { "bm25_similarity" : { "type": "BM25", "k1": "'$i'", "b": "'$j'", "discount_overlaps": "'$k'"} } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "bm25_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
        done
    done
done

# insert all the data in
for i in "0.0" "0.6" "1.2" "1.8" "2.4"; do
    for j in "0.0" "0.25" "0.50" "0.75" "1.00"; do
        for k in "true" "false"; do
            k1=`echo $i | sed -e s:\\\\.::`
            b=`echo $j | sed -e s:\\\\.::` 
            #echo "k1="$k1",b="$b",overlap="$k
            final_index_name=$4"_"$k1"_"$b"_"$k
            #echo "./read.sh $3 "$final_index_name/$4" $i 4 $ngram"
            #./read.sh $2 "$final_index_name/$3" wjk 4 true
        
            dfs="-f"
            output=results_bm25_$dfs
            mkdir $output
            #echo "java -jar tools/checker.jar -s $1 -i $final_index_name -t src -d $3 -l $i $ngram_flag $k 1> $output/$final_index_name.csv"
            java -jar tools/checker.jar -s $1 -i $final_index_name -t $3 -d $2 -l wjk -n $dfs 1> $output/$final_index_name.csv
            curl -XDELETE $1:9200/$final_index_name
        done
    done
done


