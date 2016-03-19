if [ "$#" -eq 0 ]; then
        echo "Usage: ./norm_all_bm25.sh <server name> <input folder> <ES doc type> <index prefix> <output folder>" 
        exit 1
fi

    hostname=$1
    input=$2
    doctype=$3
    index=$4
    output=$5

for i in "s" "w" "ws" "p" "ps" "pw" "pws" "k" "ks" "kw" "kws" "kp" "kps" "kpw" "kpws" "j" "js" "jw" "jws" "jp" "jps" "jpw" "jpws" "jk" "jks" "jkw" "jkws" "jkp" "jkps" "jkpw" "jkpws" "d" "ds" "dw" "dws" "dp" "dps" "dpw" "dpws" "dk" "dks" "dkw" "dkws" "dkp" "dkps" "dkpw" "dkpws" "dj" "djs" "djw" "djws" "djp" "djps" "djpw" "djpws" "djk" "djks" "djkw" "djkws" "djkp" "djkps" "djkpw" "djkpws"; do
    for n in 2 3 4 5; do
        ./scripts/best_dfr.sh $hostname $input $doctype $index $i $n $output
    done
done
