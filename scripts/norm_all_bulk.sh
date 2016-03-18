for i in "s" "w" "ws" "p" "ps" "pw" "pws" "k" "ks" "kw" "kws" "kp" "kps" "kpw" "kpws" "j" "js" "jw" "jws" "jp" "jps" "jpw" "jpws" "jk" "jks" "jkw" "jkws" "jkp" "jkps" "jkpw" "jkpws" "d" "ds" "dw" "dws" "dp" "dps" "dpw" "dpws" "dk" "dks" "dkw" "dkws" "dkp" "dkps" "dkpw" "dkpws" "dj" "djs" "djw" "djws" "djp" "djps" "djpw" "djpws" "djk" "djks" "djkw" "djkws" "djkp" "djkps" "djkpw" "djkpws"; do
	curl -XDELETE $1:9200/tests_$i
	curl -XPUT $1:9200/tests_$i -d '{ "index" : { "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
	if [ $2 == "-n" ]; then
		ngram="true"
		ngramflag="-n"
	else
		ngram="false"
		ngramflag=""
	fi
	./scripts/readbulk.sh new_tests_renamed/ tests_$i doc $i 4 $ngram
	output=norm
	mkdir $output
	java -jar tools/checker.jar -d new_tests_renamed/ -f -i tests_$i -l $i -s localhost -t doc $ngramflag 1> $output/$i.csv
	curl -XDELETE $1:9200/tests_$i
done
