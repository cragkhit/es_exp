# A script to run ES with the given normalisation
# This script creates IB index with different parameter settings of distribution, lambda, and normalization

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
for i in "ll" "spl"; do
    for j in "df" "ttf"; do
        for k in "no" "h1" "h2" "h3" "z"; do
          final_index_name=$4"_"$i"_"$j"_"$k

            echo "======================================================="
            printf "HOST:\t\t\t$hostname\n"
            printf "INDEX:\t\t\t$final_index_name/$doctype\n"
            printf "NORM:\t\t\t$norm + $n-gram\n"
            printf "SETTINGS:\t\tdistribution=$i, lambda=$j, normalization=$k\n"
            printf "DATA:\t\t\tfrom: $input to: $output\n"
            echo "======================================================="

            curl -XDELETE $hostname:9200/$final_index_name
            curl -XPUT $hostname:9200/$final_index_name -d '{ "settings": { "similarity": { "ib_similarity" : { "type": "IB", "distribution": "'$i'", "lambda": "'$j'", "normalization": "'$k'"} } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "ib_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
             ./scripts/read.sh $hostname $input "$final_index_name/$doctype" $norm $n true > /dev/null

            # use DFS mode
            dfs="-f"
            if [ ! -d $output ]; then
                mkdir $output
            fi
            java -jar tools/checker.jar -s $hostname -i $final_index_name -t $doctype -d $input -l $norm $dfs -n -g $n 1> $output/$final_index_name.csv

            # clean up by delete the index
            curl -XDELETE $hostname:9200/$final_index_name
        done
    done
done

