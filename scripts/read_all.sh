#for i in "d" "j" "k" "p" "s" "w"; do
#for i in "dj" "dk" "dp" "ds" "dw" "jk" "jp" "js" "jw" "kp" "ks" "kw" "ps" "pw" "sw"; do
#for i in "wjd" "wjk" "wjp" "wjs" "wkd" "wkp" "wks"	; do
#for i in "wjkd" "wjkp" "wjks" "wkpd" "wkps"; do
#for i in "wjkpd" "wjkps"; do
for i in "wjkpds"; do
	curl -XDELETE $1:9200/tests_$i
	curl -XPUT $1:9200/tests_$i -d '{ "index" : { "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
	./read.sh new_tests_renamed/ tests_$i/doc $i 4 false
	java -jar tools/checker.jar -d new_tests_renamed/ -f -i tests_$i -l $i -s localhost -t doc 1> results_tests/$i.csv
done
