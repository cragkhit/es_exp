names=`ls $1/*.csv`
rm $2
echo $names | sed -e "s:.csv:,:g" | sed -e s:$3::g > $2
paste -d ',' `echo $names` >> $2
