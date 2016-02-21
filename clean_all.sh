if [ "$#" -eq 0 ]; then
        echo "Usage: ./run_all.sh <server name> <similarity>"
        exit 1
fi

index_name=`echo "$2" | awk '{print tolower($0)}'` 

# create all possible index combinations
for i in "_hi" "_lo"; do
    for j in "_" "_ngram_"; do
        final_index_name="cloplag$i$j$index_name"
        curl -XDELETE $1:9200/$final_index_name
    done
done
printf "\n"
