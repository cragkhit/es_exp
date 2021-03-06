if [ "$#" -eq 0 ]; then
        echo "Usage: ./norm_all_bulk.sh <hostname> <input folder> <ngram (true/false)> <size of n> <output folder>" 
        exit 1
fi

for i in "s" "w" "ws" "p" "ps" "pw" "pws" "k" "ks" "kw" "kws" "kp" "kps" "kpw" "kpws" "j" "js" "jw" "jws" "jp" "jps" "jpw" "jpws" "jk" "jks" "jkw" "jkws" "jkp" "jkps" "jkpw" "jkpws" "d" "ds" "dw" "dws" "dp" "dps" "dpw" "dpws" "dk" "dks" "dkw" "dkws" "dkp" "dkps" "dkpw" "dkpws" "dj" "djs" "djw" "djws" "djp" "djps" "djpw" "djpws" "djk" "djks" "djkw" "djkws" "djkp" "djkps" "djkpw" "djkpws"; do
	hostname=$1
	input=$2
	ngram=$3
	size_of_n=$4
	output=$5
	curl -XDELETE $hostname:9200/$i
	curl -XPUT $hostname:9200/$i -d '{ "index" : { "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
	if [ $ngram == "true" ]; then
		ngram="true"
		ngramflag="-n"
	else
		ngram="false"
		ngramflag=""
	fi
	./scripts/readbulk.sh $input $i doc $i $size_of_n $ngram
	mkdir $output
	java -jar tools/checker.jar -d $input -f -i $i -l $i -s $hostname -t doc $ngramflag -g $size_of_n 1> $output/$i.csv
	curl -XDELETE $hostname:9200/$i
done
