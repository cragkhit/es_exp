if [ "$#" -eq 0 ]; then
        echo "Usage: ./create_all_dfr_index.sh <basic_model> <after_effect> <normalization>" 
        exit 1
fi

hostname="localhost"
basic_model=$1
after_effect=$2
normalization=$3

for i in "s" "w" "ws" "p" "ps" "pw" "pws" "k" "ks" "kw" "kws" "kp" "kps" "kpw" "kpws" "j" "js" "jw" "jws" "jp" "jps" "jpw" "jpws" "jk" "jks" "jkw" "jkws" "jkp" "jkps" "jkpw" "jkpws" "d" "ds" "dw" "dws" "dp" "dps" "dpw" "dpws" "dk" "dks" "dkw" "dkws" "dkp" "dkps" "dkpw" "dkpws" "dj" "djs" "djw" "djws" "djp" "djps" "djpw" "djpws" "djk" "djks" "djkw" "djkws" "djkp" "djkps" "djkpw" "djkpws" "e"; do
  for n in 2 3 4 5; do
    final_index_name="dfr_"$basic_model"_"$after_effect"_"$normalization"_"$i"_"$n
    curl -XDELETE $hostname:9200/$final_index_name
    # curl -XPUT $hostname:9200/$final_index_name -d '{ "settings": { "similarity": { "dfr_similarity" : { "type": "DFR", "basic_model": "'$basic_model'", "after_effect": "'$after_effect'", "normalization": "'$normalization'", "normalization.h2.c": "3.0" } } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "dfr_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
  done
done
