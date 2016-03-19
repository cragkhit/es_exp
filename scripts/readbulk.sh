TOKENIZER="tools/java_tokenizer.jar"
if [ "$#" -eq 0 ]; then
	echo "Usage: ./readbulk.sh <hostname> <input dir> <index> <type> <norm level (w/d/j/p/k/s/e)> <n value of ngram> <ngram (true/false)>"
	exit 1
fi
    hostname=$1
    input=$2
    index=$3
    doctype=$4
    norm=$5
    n=$6
    ngram=$7

for file in $input/*.java
do
    #echo $file
    #whatever you need with "$file"
    id=`echo $file | sed -e "s:$input\/::" | sed -e 's/.java//'`
    src=`java -jar "$TOKENIZER" -f $file -l $norm -v $n -n $ngram`
    echo "{ \"index\": { \"_index\": \"$index\", \"_type\": \"$doctype\", \"_id\": \"$id\" }}" >> bulk.query
    echo "{ \"src\": \"$src\" }" >> bulk.query
done

curl -XPOT -s -XPOST $hostname:9200/_bulk --data-binary @bulk.query; echo
rm bulk.query
