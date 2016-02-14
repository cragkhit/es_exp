TOKENIZER="tools/java_tokenizer.jar"

for file in $1/*.java
do
    #whatever you need with "$file"
    id=`echo $file | sed -e "s:$1\/::" | sed -e 's/.java//'`
    src=`sudo java -jar "$TOKENIZER" $file $3`
    printf $file
    #printf "%qcurl -XPUT 'http://localhost:9200/$2/$id' -d '{ \"id\" : \"$id\", \"src\" : \"$src\"}'\n"
    curl -XPUT "http://localhost:9200/$2/$id?pretty" -d "{ \"id\" : \"$id\", \"src\" : \"$src\"}" | grep created
done
