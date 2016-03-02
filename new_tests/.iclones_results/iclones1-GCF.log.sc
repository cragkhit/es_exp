DEBUG - Running SimCal v. 0.1
DEBUG - Main file = bubblesort/0_orig
DEBUG - 


DEBUG - GCF file = iclones1-GCF.xml
DEBUG - =================================
DEBUG - 1. Start extracting clone classes
DEBUG - =================================
DEBUG - Root element :CloneClasses
DEBUG - Number of clone classes = 1
DEBUG - 0: Node name = CloneClass, child nodes = 7
DEBUG - > 3: Node name = Clone, childs = 3
DEBUG - >> Node name = Fragment
DEBUG -       >> Node name = File, value = bubblesort/0_orig/BubbleSort.java
DEBUG -       >> Node name = Start, value = 3
DEBUG -       >> Node name = End, value = 38
DEBUG - > 5: Node name = Clone, childs = 3
DEBUG - >> Node name = Fragment
DEBUG -       >> Node name = File, value = newbubblesort/0_orig/0_orig/BubbleSort.java
DEBUG -       >> Node name = Start, value = 3
DEBUG -       >> Node name = End, value = 38
DEBUG - Number of clone classes (after parsing) = 1
DEBUG - 


DEBUG - line count file = /cs/academic/phd3/cragkhit/cloplag/programs/linecount.csv
DEBUG - =================================
DEBUG - 2. Start reading linecount file
DEBUG - =================================
DEBUG - Read line count successfully. Number of total files = 100
DEBUG - 


DEBUG - =========================================
DEBUG - 3. calculateSimilarity
DEBUG - =========================================
DEBUG - Info: total clone classes = 1
DEBUG - Info: looking for clones in = bubblesort/0_orig
DEBUG - -------------- Index = 0-------------
DEBUG - clones = 2
DEBUG - Found ---> f1: bubblesort/0_orig/BubbleSort.java,3,38,36
DEBUG - f2: newbubblesort/0_orig/0_orig/BubbleSort.java,3,38,36
DEBUG - Adding bubblesort/0_orig/BubbleSort.java
DEBUG - 


DEBUG - ==================================================================
DEBUG - 4. Finished finding all the clone fragments.
DEBUG -    Start merging fragments.
DEBUG - ==================================================================
DEBUG - ---------------------------
DEBUG - Frag 0 bubblesort/0_orig/BubbleSort.java,3,38,36
DEBUG - >>>>>>>>>>>> Merged list: size = 1
DEBUG - 0:bubblesort/0_orig/BubbleSort.java,3,38,36
DEBUG - >>>>>>>>>>>> Final merged list: size = 1
DEBUG - 0:bubblesort/0_orig/BubbleSort.java,3,38,36
DEBUG - 


DEBUG - =============================
DEBUG - 5. Summary
DEBUG - =============================
DEBUG - total size = 36
DEBUG - ERROR: error(s) in calculating similarity. Check the file path and hash.
