if [ "$#" -eq 0 ]; then
        echo "Usage: ./norm_all_bulk.sh <hostname> <input folder> <ngram (true/false)>" 
        exit 1
fi

for i in "d" "j" "k" "p" "s" "w"; do 
#"ps" "pw" "pws" "k" "ks" "kw" "kws" "kp" "kps" "kpw" "kpws" "j" "js" "jw" "jws" "jp" "jps" "jpw" "jpws" "jk" "jks" "jkw" "jkws" "jkp" "jkps" "jkpw" "jkpws" "d" "ds" "dw" "dws" "dp" "dps" "dpw" "dpws" "dk" "dks" "dkw" "dkws" "dkp" "dkps" "dkpw" "dkpws" "dj" "djs" "djw" "djws" "djp" "djps" "djpw" "djpws" "djk" "djks" "djkw" "djkws" "djkp" "djkps" "djkpw" "djkpws"; do
#for i in "dj" "dk" "dp" "ds" "dw" "jk" "jp" "js" "jw" "kp" "ks" "kw" "ps" "pw" "sw"; do
#for i in "kwd" "kwj" "kwp" "kws"; do
#for i in "kwdj" "kwdp" "kwds" "kwpd" "kwpj" "kwps"; do
#for i in "kwdpj" "kwdps" "kwdjps"; do
#for i in "wpd" "wpj" "wpk" "wps"; do
#for i in "wpd" "wps"; do
#for i in "wpjkd" "wpjks" "wdjkps"; do
#for i in "wjkd" "wjkp" "wjks"; do
#for i in "wjkpd" "wjkps"; do
#for i in "dkpw" "dkw" "kpw" "kw"; do
#for i in "d" "j" "k" "p" "s" "w" "dj" "dk" "dp" "ds" "dw" "jk" "jp" "js" "jw" "kp" "ks" "kw" "ps" "pw" "sw" "wjd" "wjk" "wjp" "wjs" "wkd" "wkp" "wks" "wpd" "wps" "wjkd" "wjkp" "wjks" "wkpd" "wkps" "wjkd" "wjkp" "wjkpd" "wjkps" "wjkpds"; do
#for i in "wjkp"; do
	hostname=$1
	input=$2
	ngram=$3
	curl -XDELETE $hostname:9200/$i
	curl -XPUT $hostname:9200/$i -d '{ "index" : { "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
	if [ $ngram == "true" ]; then
		ngram="true"
		ngramflag="-n"
	else
		ngram="false"
		ngramflag=""
	fi
	./scripts/readbulk.sh $input $i doc $i 4 $ngram
	output=norm
	mkdir $output
	java -jar tools/checker.jar -d $input -f -i $i -l $i -s $hostname -t doc $ngramflag 1> $output/$i.csv
	curl -XDELETE $hostname:9200/$i
done
