#for i in "d" "j" "k" "p" "s" "w" "dj" "dk" "dp" "ds" "dw" "jk" "jp" "js" "jw" "kp" "ks" "kw" "ps" "pw" "sw"; do
#for i in "kwd" "kwj" "kwp" "kws"; do
#for i in "kwdj" "kwdp" "kwds" "kwpd" "kwpj" "kwps"; do
#for i in "kwdpj" "kwdps" "kwdjps"; do
#for i in "wpd" "wpj" "wpk" "wps"; do
#for i in "wpd" "wps"; do
for i in "wpjkd" "wpjks" "wdjkps"; do
#for i in "wjkd" "wjkp" "wjks"; do
#for i in "wjkpd" "wjkps"; do
#for i in "wjkpds"; do
#for i in "d" "j" "k" "p" "s" "w" "dj" "dk" "dp" "ds" "dw" "jk" "jp" "js" "jw" "kp" "ks" "kw" "ps" "pw" "sw" "wjd" "wjk" "wjp" "wjs" "wkd" "wkp" "wks" "wpd" "wps" "wjkd" "wjkp" "wjks" "wkpd" "wkps" "wjkd" "wjkp" "wjkpd" "wjkps" "wjkpds"; do
#for i in "wjkp"; do
	curl -XDELETE $1:9200/tests_$i
	curl -XPUT $1:9200/tests_$i -d '{ "index" : { "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
	./scripts/read.sh new_tests_renamed/ tests_$i/doc $i 4 false
	output=norm
	mkdir $output
	java -jar tools/checker.jar -d new_tests_renamed/ -f -i tests_$i -l $i -s localhost -t doc 1> $output/$i.csv
	curl -XDELETE $1:9200/tests_$i
done
