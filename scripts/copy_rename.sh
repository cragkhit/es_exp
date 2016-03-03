for i in $(find $1 -name "*.java"); 
do
    #echo $i
    newname=`echo $i | sed -e "s:$1/::g" | sed -e "s:/:$:g"`
    #echo $newname
    cp "$i" $2/"$newname"
done
