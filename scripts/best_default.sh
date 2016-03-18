# A script to run ES with the given normalisation
# This script creates TF/IDF index with different parameter settings of discount_overlap (true/false/-)

if [ "$#" -eq 0 ]; then
        echo "Usage: ./run_all.sh <server name> <input folder> <ES doc type> <index prefix> <normalization> <size of n> <output folder>" 
        exit 1
fi

    hostname=$1
    input=$2
    doctype=$3
    index=$4
    norm=$5
    n=$6
    output=$7
# create all possible index combinations
for i in "no" "true" "false"; do
    final_index_name="$index-$i-$norm-$n"
    
    echo "======================================================="
    printf "HOST:\t\t\t$hostname\n"
    printf "INDEX:\t\t\t$final_index_name/$doctype\n"
    printf "NORM:\t\t\t$norm + $n-gram\n"
    printf "SETTINGS:\t\t$i\n"
    printf "DATA:\t\t\tfrom: $input to: $output\n"
    echo "======================================================="

    # delete the index if it exists
    curl -XDELETE $hostname:9200/$final_index_name

    if [ $i == "no" ] 
    then 
        curl -XPUT $hostname:9200/$final_index_name -d '{ "index" : { "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
    else
        curl -XPUT $hostname:9200/$final_index_name -d '{ "settings": { "similarity": { "tfidf_similarity" : { "type": "default", "discount_overlaps": "'$i'"} } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "tfidf_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
    fi

    ./scripts/readbulk.sh $input $final_index_name $doctype $norm $n true

    # use DFS mode
    dfs="-f"
    mkdir $output
    java -jar tools/checker.jar -s $hostname -i $final_index_name -t $doctype -d $input -l $norm $dfs -n -g $n 1> $output/$final_index_name.csv

    # clean up by delete the index
    curl -XDELETE $hostname:9200/$final_index_name
done
