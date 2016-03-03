if [ "$#" -eq 0 ]; then
        echo "Usage: ./run_all.sh <server name> <similarity> <input folder> <ES doc type> <index prefix>" 
        exit 1
fi

index_name=`echo "$2" | awk '{print tolower($0)}'` 

# create all possible index combinations
for i in "_hi" "_lo"; do
    for j in "_" "_ngram_"; do
        final_index_name="$5$i$j$index_name"
	curl -XDELETE $1:9200/$final_index_name
        if [ $2 == "DFR" ] 
        then
	    echo "Sim: $2"
            curl -XPUT $1:9200/$final_index_name -d '{ "settings": { "similarity": { "dfr_similarity" : { "type": "DFR", "basic_model": "p", "after_effect": "b", "normalization": "z", "normalization.h2.c": "3.0" } } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "dfr_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
        elif [ $2 == "BM25" ]
        then
	    echo "Sim: $2"
            curl -XPUT $1:9200/$final_index_name -d '{ "settings": { "similarity": { "bm25_similarity" : { "type": "BM25", "k1": "1.2", "b": "0.75", "discount_overlaps": "true"} } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "bm25_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
        elif [ $2 == "IB" ]
        then
	    echo "Sim: $2"
            curl -XPUT $1:9200/$final_index_name -d '{ "settings": { "similarity": { "ib_similarity" : { "type": "IB", "distribution": "ll", "lambda": "df", "normalization": "no"} } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "ib_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
        elif [ $2 == "LMDirichlet" ]
        then
        echo "Sim: $2"
            curl -XPUT $1:9200/$final_index_name -d '{ "settings": { "similarity": { "lmd_similarity" : { "type": "LMDirichlet", "mu": "2000" } } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "lmd_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
        elif [ $2 == "LMJelinekMercer" ]
        then
        echo "Sim: $2"
            curl -XPUT $1:9200/$final_index_name -d '{ "settings": { "similarity": { "lmj_similarity" : { "type": "LMJelinekMercer", "lambda": "0.7" } } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "lmd_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
        else
	    echo "Sim: $2"
            curl -XPUT $1:9200/$final_index_name -d '{ "index" : { "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
        fi
    done
done

# insert all the data in
for i in "hi" "lo"; do
    for j in "_" "_ngram_"; do
        final_index_name="$5_$i$j$index_name"
        if [ $j == "_" ] 
        then 
            ngram="false"
            ngram_flag=""
        else 
            ngram="true"
            ngram_flag="-n"
        fi
        #echo "./read.sh $3 "$final_index_name/$4" $i 4 $ngram"
        ./read.sh $3 "$final_index_name/$4" $i 4 $ngram
        
        #mkdir $output
        #for k in "" "-f"; do
        # use only DFS mode for now
            k="-f"
            output=results_$2$k
            mkdir $output
            #echo "java -jar tools/checker.jar -s $1 -i $final_index_name -t src -d $3 -l $i $ngram_flag $k 1> $output/$final_index_name.csv"
            java -jar tools/checker.jar -s $1 -i $final_index_name -t src -d $3 -l $i $ngram_flag $k 1> $output/$final_index_name.csv
        #done
    done
done


