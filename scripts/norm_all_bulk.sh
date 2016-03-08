for i in "s" "w" "ws" "p" "ps" "pw" "pws" "k" "ks" "kw" "kws" "kp" "kps" "kpw" "kpws" "j" "js" "jw" "jws" "jp" "jps" "jpw" "jpws" "jk" "jks" "jkw" "jkws" "jkp" "jkps" "jkpw" "jkpws" "d" "ds" "dw" "dws" "dp" "dps" "dpw" "dpws" "dk" "dks" "dkw" "dkws" "dkp" "dkps" "dkpw" "dkpws" "dj" "djs" "djw" "djws" "djp" "djps" "djpw" "djpws" "djk" "djks" "djkw" "djkws" "djkp" "djkps" "djkpw" "djkpws"; do
#for i in "dj" "dk" "dp" "ds" "dw" "jk" "jp" "js" "jw" "kp" "ks" "kw" "ps" "pw" "sw"; do
#for i in "kwd" "kwj" "kwp" "kws"; do
#for i in "kwdj" "kwdp" "kwds" "kwpd" "kwpj" "kwps"; do
#for i in "kwdpj" "kwdps" "kwdjps"; do
#for i in "wpd" "wpj" "wpk" "wps"; do
#for i in "wpd" "wps"; do
#for i in "wpjkd" "wpjks" "wdjkps"; do
#for i in "wjkd" "wjkp" "wjks"; do
#for i in "wjkpd" "wjkps"; do
#for i in "wjkpds"; do
#for i in "d" "j" "k" "p" "s" "w" "dj" "dk" "dp" "ds" "dw" "jk" "jp" "js" "jw" "kp" "ks" "kw" "ps" "pw" "sw" "wjd" "wjk" "wjp" "wjs" "wkd" "wkp" "wks" "wpd" "wps" "wjkd" "wjkp" "wjks" "wkpd" "wkps" "wjkd" "wjkp" "wjkpd" "wjkps" "wjkpds"; do
#for i in "wjkp"; do
	curl -XDELETE $1:9200/tests_$i
	curl -XPUT $1:9200/tests_$i -d '{ "index" : { "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
	./scripts/readbulk.sh new_tests_renamed/ tests_$i doc $i 4 false
	output=norm
	mkdir $output
	java -jar tools/checker.jar -d new_tests_renamed/ -f -i tests_$i -l $i -s localhost -t doc 1> $output/$i.csv
	curl -XDELETE $1:9200/tests_$i
done
