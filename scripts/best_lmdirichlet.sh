if [ "$#" -eq 0 ]; then
        echo "Usage: ./run_all.sh <server name> <input folder> <ES doc type> <index prefix> <normalization>" 
        exit 1
fi

# create all possible index combinations
for i in "500" "1000" "1500" "2000" "2500" "3000"; do
  final_index_name=$4"_"$i
  curl -XDELETE $1:9200/$final_index_name
  curl -XPUT $1:9200/$final_index_name -d '{ "settings": { "similarity": { "lmd_similarity" : { "type": "LMDirichlet", "mu": "'$i'" } } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "lmd_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'

  ./scripts/readbulk.sh $2 "$final_index_name" "$3" $5 4 true

  dfs="-f"
  output=best_param_lmdirichlet
  mkdir $output
  #echo "java -jar tools/checker.jar -s $1 -i $final_index_name -t src -d $3 -l $i $ngram_flag $k 1> $output/$final_index_name.csv"
  java -jar tools/checker.jar -s $1 -i $final_index_name -t $3 -d $2 -l $5 -n $dfs 1> $output/$5ngram_$final_index_name.csv
  curl -XDELETE $1:9200/$final_index_name
done
