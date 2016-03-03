files=($1/*)                    #creates an array of all the files within src/ */
filecount="${#files[@]}"         #determines the length of the array
echo $filecount
for var in `seq 1 100`;
do
	filecount=$((filecount-1))
	rand=`od -vAn -N4 -tu4 < /dev/urandom`
	randomid=$((rand % filecount)) #uses $RANDOM to choose a random number between 0 and $filecount
	#echo $randomid
	filetomove="${files[$randomid]}" #the random file wich we'll move
	mv "$filetomove" $2/
	echo "$var: Moved $filetomove"
done
