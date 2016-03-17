if [ "$#" -eq 0 ]; then
        echo "Usage: ./run_all.sh <server name> <input folder> <ES doc type> <index prefix> <normalization> <output folder>" 
        exit 1
fi

# create all possible index combinations
for i in "no" "true" "false"; do
    final_index_name=$4"_"$i
    curl -XDELETE $1:9200/$final_index_name
    if [ $i == "no" ] 
    then 
        curl -XPUT $1:9200/$final_index_name -d '{ "index" : { "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
    else
        curl -XPUT $1:9200/$final_index_name -d '{ "settings": { "similarity": { "tfidf_similarity" : { "type": "default", "discount_overlaps": "'$i'"} } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "tfidf_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
    fi

    ./scripts/readbulk.sh $2 $final_index_name $3 $5 4 true

    dfs="-f"
    output=$6
    mkdir $output
    #echo "java -jar tools/checker.jar -s $1 -i $final_index_name -t src -d $3 -l $i $ngram_flag $k 1> $output/$final_index_name.csv"
    java -jar tools/checker.jar -s $1 -i $final_index_name -t $3 -d $2 -l $5 $dfs -n 1> $output/$5ngram_$final_index_name.csv
    curl -XDELETE $1:9200/$final_index_name
done
