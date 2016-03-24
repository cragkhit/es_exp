# A script to run ES with the given normalisation
# This script creates DFR index with different parameter settings of basic_model, after_effect, and normalization

if [ "$#" -eq 0 ]; then 
        echo "Usage: ./best_dfr.sh <1. input folder> <2. index prefix> <3. size of n> <4. normalisation> <5. output folder> <6.basic_model> <7. after_effect> <8. normalization> <9. working dir>" 
        exit 1
fi

hostname="localhost"
input=$1
doctype="doc"
index=$2
norm=$4
n=$3
output=$5
basic_model=$6
after_effect=$7
normalization=$8
HOME=$9


final_index_name=$index"_"$basic_model"_"$after_effect"_"$normalization

#echo "======================================================="
#printf "HOST:\t\t\t$hostname\n"
#printf "INDEX:\t\t\t$final_index_name/$doctype\n"
#printf "NORM:\t\t\t$norm + $n-gram\n"
#printf "SETTINGS:\t\tbasic_model=$basic_model, after_effect=$after_effect, normalization=$normalization\n"
#printf "DATA:\t\t\tfrom: $input to: $output\n"
#echo "======================================================="

#curl -s -XDELETE $hostname:9200/$final_index_name > /dev/null
curl -s -XPUT $hostname:9200/$final_index_name -d '{ "settings": { "similarity": { "dfr_similarity" : { "type": "DFR", "basic_model": "'$basic_model'", "after_effect": "'$after_effect'", "normalization": "'$normalization'", "normalization.h2.c": "3.0" } } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "dfr_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }' > /dev/null

cd $HOME
./scripts/read.sh localhost $input "$final_index_name/$doctype" $norm $n true > /dev/null


# do a refresh to make all index available
#curl -XPOST $hostname:9200/$final_index_name/_refresh > /dev/null
#echo "Before sleep"
sleep 10
#echo "After sleep"

# use DFS mode
dfs="-f"

if [ ! -d "$output" ]; then
    mkdir $output
fi

java -jar tools/checker_evo.jar -s $hostname -i $final_index_name -t $doctype -d $input -l $norm $dfs -n -g $n #1> $output/$final_index_name.csv 

  # clean up by delete the index
curl -s -XDELETE $hostname:9200/$final_index_name > /dev/null
