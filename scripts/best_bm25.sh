# A script to run ES with the given normalisation
# This script creates BM25 index with different parameter settings of k1, b, and discount_overlap

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
for i in "0.0" "0.6" "1.2" "1.8" "2.4"; do
    for j in "0.0" "0.25" "0.50" "0.75" "1.00"; do
        for k in "true" "false"; do
            k1=`echo $i | sed -e s:\\\\.::`
            b=`echo $j | sed -e s:\\\\.::` 
            final_index_name=$index"_"$k1"_"$b"_"$k
    
            echo "======================================================="
            printf "HOST:\t\t\t$hostname\n"
            printf "INDEX:\t\t\t$final_index_name/$doctype\n"
            printf "NORM:\t\t\t$norm + $n-gram\n"
            printf "SETTINGS:\t\tk1=$i, b=$j, discount_overlap=$k\n"
            printf "DATA:\t\t\tfrom: $input to: $output\n"
            echo "======================================================="

            curl -XDELETE $hostname:9200/$final_index_name
            curl -XPUT $hostname:9200/$final_index_name -d '{ "settings": { "similarity": { "bm25_similarity" : { "type": "BM25", "k1": "'$i'", "b": "'$j'", "discount_overlap": "'$k'"} } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "bm25_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
        
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

