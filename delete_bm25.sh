for i in "0.0" "0.6" "1.2" "1.8" "2.4"; do
    for j in "0.0" "0.25" "0.50" "0.75" "1.00"; do
        for k in "true" "false"; do
           k1=`echo $i | sed -e s:\\\\.::`
           b=`echo $j | sed -e s:\\\\.::` 
           #echo "k1="$k1",b="$b",overlap="$k
           final_index_name=$k1"_"$b"_"$k
#           #echo $final_index_name
	       curl -XDELETE $1:9200/$final_index_name
	    done
	done
done