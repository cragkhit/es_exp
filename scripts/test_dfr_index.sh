# A script to run ES with the given normalisation
# This script creates DFR index with different parameter settings of basic_model, after_effect, and normalization

if [ "$#" -eq 0 ]; then
        echo "Usage: ./best_bm25.sh <server name> <index prefix> <ES doc type> <basic_model> <after_effect> <normalization> <input folder> <norm> <size of n>" 
        exit 1
fi

hostname=$1
index=$2
doctype=$3
basic_model=$4
after_effect=$5
normalization=$6
input=$7
norm=$8
n=$9

final_index_name=$index"_"$basic_model"_"$after_effect"_"$normalization

echo "======================================================="
printf "HOST:\t\t\t$hostname\n"
printf "INDEX:\t\t\t$final_index_name/$doctype\n"
printf "NORM:\t\t\t$norm + $n-gram\n"
printf "SETTINGS:\t\tbasic_model=$basic_model, after_effect=$after_effect, normalization=$normalization\n"
printf "DATA:\t\t\tfrom: $input to: $final_index_name\n"
echo "======================================================="

curl -XDELETE $hostname:9200/$final_index_name
curl -XPUT $hostname:9200/$final_index_name -d '{ "settings": { "similarity": { "dfr_similarity" : { "type": "DFR", "basic_model": "'$basic_model'", "after_effect": "'$after_effect'", "normalization": "'$normalization'", "normalization.h2.c": "3.0" } } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "dfr_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'

./scripts/read.sh $hostname $input "$final_index_name/$doctype" $norm $n true > /dev/null

sleep 10

# use DFS mode
dfs="-f"
java -jar tools/checker_evo.jar -s $hostname -i $final_index_name -t $doctype -d $input -l $norm $dfs -n -g $n #1> $final_index_name.csv

# clean up by delete the index
curl -XDELETE $hostname:9200/$final_index_name
