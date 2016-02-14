count=1
for i in $(find $2 -name "*.java"); 
do
	>&2 echo $count
	java -jar tools/checker.jar $1 $i $3 $4
	count=$((count+1))
done
