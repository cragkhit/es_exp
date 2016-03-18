if [ "$#" -eq 0 ]; then
        echo "Usage: ./run_all.sh <server name> <input folder> <ES doc type> <index prefix> <normalization>" 
        exit 1
fi

# create all possible index combinations
for i in "0.0" "0.6" "1.2" "1.8" "2.4"; do
    for j in "0.0" "0.25" "0.50" "0.75" "1.00"; do
#        for k in "true" "false"; do
            k1=`echo $i | sed -e s:\\\\.::`
            b=`echo $j | sed -e s:\\\\.::` 
            final_index_name=$4"_"$k1"_"$b"_"$k
            curl -XDELETE $1:9200/$final_index_name
            curl -XPUT $1:9200/$final_index_name -d '{ "settings": { "similarity": { "bm25_similarity" : { "type": "BM25", "k1": "'$i'", "b": "'$j'"} } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "bm25_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
            ./scripts/readbulk.sh $2 "$final_index_name" "$3" $5 4 true

            dfs="-f"
            output=best_param_bm25
            mkdir $output
            java -jar tools/checker.jar -s $1 -i $final_index_name -t $3 -d $2 -l $5 -n $dfs 1> $output/$5ngram_$final_index_name"_no_do".csv
            curl -XDELETE $1:9200/$final_index_name
#        done
    done
done

