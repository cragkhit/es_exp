TOKENIZER="tools/java_tokenizer.jar"
if [ "$#" -eq 0 ]; then
	echo "Usage: ./read.sh <input dir> <index/type> <norm level (w/d/j/p/k/s/e)> <n value of ngram> <ngram (true/false)>"
	exit 1
fi
for file in $1/**/*.java
do
    #whatever you need with "$file"
    id=`basename $file | sed -e 's/.java//'`
    #echo $id
    src=`java -jar "$TOKENIZER" -f $file -l $3 -v $4 -n $5`
    #echo "src="$src
    printf $id", "
    #echo "curl -XPUT 'http://localhost:9200/$2/$id' -d '{ \"id\" : \"$id\", \"src\" : \"$src\"}'"
    curl -s -XPUT "http://localhost:9200/$2/$id?pretty" -d "{ \"id\" : \"$id\", \"src\" : \"$src\"}" > /dev/null
done
