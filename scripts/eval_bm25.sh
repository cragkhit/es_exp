# A script to run ES with the given normalisation
# This script creates DFR index with different parameter settings of basic_model, after_effect, and normalization

if [ "$#" -eq 0 ]; then 
        echo "Usage: ./best_bm25.sh <1. input folder> <2. index prefix> <3. size of n> <4. normalisation> <5. output folder> <6.k1> <7. b> <8. discount_overlap> <9. working dir>" 
        exit 1
fi

hostname="localhost"
input=$1
doctype="doc"
index=$2
norm=$4
n=$3
output=$5
k1v=$6
bv=$7
discount_overlap=$8
HOME=$9

k1=`echo $k1v | sed -e s:\\\\.::`
b=`echo $bv | sed -e s:\\\\.::` 
final_index_name=$index"_"$k1"_"$b"_"$discount_overlap

#echo "======================================================="
#printf "HOST:\t\t\t$hostname\n"
#printf "INDEX:\t\t\t$final_index_name/$doctype\n"
#printf "NORM:\t\t\t$norm + $n-gram\n"
#printf "SETTINGS:\t\tbasic_model=$basic_model, after_effect=$after_effect, normalization=$normalization\n"
#printf "DATA:\t\t\tfrom: $input to: $output\n"
#echo "======================================================="

#curl -s -XDELETE $hostname:9200/$final_index_name > /dev/null
curl -s -XPUT $hostname:9200/$final_index_name -d '{ "settings": { "similarity": { "bm25_similarity" : { "type": "BM25", "k1": "'$k1'", "b": "'$b'", "discount_overlap": "'$discount_overlap'"} } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "bm25_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'

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
