if [ "$#" -eq 0 ]; then
        echo "Usage: ./combin_csv.sh <directory> <output file> <unwanted prefix>" 
        exit 1
fi

names=`ls $1/*.csv`

# delete the file if it exists
if [ -f $2 ]; then rm $2; fi

echo $names | sed -e "s:.csv:,:g" | sed -e s:$3::g > $2
paste -d ',' `echo $names` >> $2
