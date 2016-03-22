TOKENIZER="tools/java_tokenizer.jar"
if [ "$#" -eq 0 ]; then
	echo "Usage: ./read.sh <hostname> <input dir> <index/type> <norm level (w/d/j/p/k/s/e)> <n value of ngram> <ngram (true/false)>"
	exit 1
fi

hostname=$1
inputDir=$2
index=$3
norm=$4
n=$5
ngram=$6

for file in $inputDir/*.java
do
    #whatever you need with "$file"
    id=`basename $file | sed -e 's/.java//'`
    #echo $id
    src=`java -jar "$TOKENIZER" -f $file -l $norm -v $n -n $ngram`
    #echo "src="$src
    printf $id", "
    curl -s -XPUT "http://$hostname:9200/$index/$id?pretty" -d "{ \"id\" : \"$id\", \"src\" : \"$src\"}" > /dev/null
done
