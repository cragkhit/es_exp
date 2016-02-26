TOKENIZER="tools/java_tokenizer.jar"
if [ "$#" -eq 0 ]; then
	echo "Usage: ./read.sh <input dir> <index/type> <norm level (hi/lo/esc)> <n value of ngram> <ngram (true/false)>"
	exit 1
fi
for file in $1/*.java
do
    #whatever you need with "$file"
    id=`echo $file | sed -e "s:$1\/::" | sed -e 's/.java//'`
    src=`java -jar "$TOKENIZER" -f $file -l $3 -v $4 -n $5`
    printf $file
    #echo "curl -XPUT 'http://localhost:9200/$2/$id' -d '{ \"id\" : \"$id\", \"src\" : \"$src\"}'"
    curl -XPUT "http://localhost:9200/$2/$id?pretty" -d "{ \"id\" : \"$id\", \"src\" : \"$src\"}"
done
