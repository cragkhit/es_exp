for i in $(find $1 -name "*.java"); 
do
    java -jar ../tools/extractor.jar $i $2
done
