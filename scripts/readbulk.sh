TOKENIZER="tools/java_tokenizer.jar"
if [ "$#" -eq 0 ]; then
	echo "Usage: ./readbulk.sh <input dir> <index> <type> <norm level (w/d/j/p/k/s/e)> <n value of ngram> <ngram (true/false)>"
	exit 1
fi
for file in $1/*.java
do
    #whatever you need with "$file"
    id=`echo $file | sed -e "s:$1\/::" | sed -e 's/.java//'`
    src=`java -jar "$TOKENIZER" -f $file -l $4 -v $5 -n $6`
    printf $file" "
    #echo "curl -XPUT 'http://localhost:9200/$2/$id' -d '{ \"id\" : \"$id\", \"src\" : \"$src\"}'"
    #curl -XPUT "http://localhost:9200/$2/$id?pretty" -d "{ \"id\" : \"$id\", \"src\" : \"$src\"}"
    echo '{ "index":  { "_index": "'$2'", "_type": "'$3'" }}\n' > bulk.query
    echo '{ "src":    "'$src'" }' >> bulk.query
    curl -XPOT -s -XPOST localhost:9200/_bulk --data-binary "@requests"; bulk.query
    #rm bulk.query
done
