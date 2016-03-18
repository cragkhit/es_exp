curl -XDELETE localhost:9200/$1
curl -XPUT localhost:9200/$1 -d '{ "settings": { "similarity": { "dfr_similarity" : { "type": "DFR", "basic_model": "ine", "after_effect": "l", "normalization": "h2", "normalization.h2.c": "3.0" } } }, "mappings": {  "doc":{  "properties": {  "src": {  "type": "string",  "similarity": "dfr_similarity"  }  }  }  } ,  "index" : {  "analysis" : { "analyzer" : { "default" : { "type" : "whitespace" } } } } }'
curl -XGET localhost:9200/$1/_settings?pretty
curl -XGET localhost:9200/_cat/indices?pretty
./scripts/read.sh extracted_data $1/doc $1 4 true > /dev/null  
