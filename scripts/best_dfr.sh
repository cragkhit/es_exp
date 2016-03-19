# A script to run ES with the given normalisation
# This script creates DFR index with different parameter settings of basic_model, after_effect, and normalization

if [ "$#" -eq 0 ]; then
        echo "Usage: ./best_bm25.sh <server name> <input folder> <ES doc type> <index prefix> <normalization> <size of n> <output folder>" 
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
for basic_model in "be" "d" "g" "if" "in" "ine" "p"; do
    for after_effect in "no" "b" "l"; do
        for normalization in "no" "h1" "h2" "h3" "z"; do
          final_index_name=$index"_"$basic_model"_"$after_effect"_"$normalization

          echo "======================================================="
            printf "HOST:\t\t\t$hostname\n"
            printf "INDEX:\t\t\t$final_index_name/$doctype\n"
            printf "NORM:\t\t\t$norm + $n-gram\n"
            printf "SETTINGS:\t\tbasic_model=$basic_model, after_effect=$after_effect, normalization=$normalization\n"
            printf "DATA:\t\t\tfrom: $input to: $output\n"
          echo "======================================================="

          curl -XDELETE $hostname:9200/$final_index_name
          curl -XPUT $hostname:9200/$final_index_name -d '{ "settings": { "similarity": { "dfr_similarity" : { "type": "DFR", "basic_model": "'$basic_model'", "after_effect": "'$after_effect'", "normalization": "'$normalization'", "normalization.h2.c": "3.0" } } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "dfr_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'

          ./scripts/readbulk.sh $input $final_index_name $doctype $norm $n true

           # use DFS mode
            dfs="-f"
            mkdir $output
            java -jar tools/checker.jar -s $hostname -i $final_index_name -t $doctype -d $input -l $norm $dfs -n -g $n 1> $output/$final_index_name.csv

            # clean up by delete the index
          curl -XDELETE $hostname:9200/$final_index_name
        done
    done
done
