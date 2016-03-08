#!/bin/bash
for i in $(find $1 -name "*.csv"); 
do
	printf $i","
	while IFS='' read -r line || [[ -n "$line" ]]; do
	    #echo $line
	    #declare -a myarr=(`echo $line`)
	    printf $line","
	done < "$i"
	printf "\n"
done
