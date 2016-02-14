import java.io.*;
class Intersection {
    static int[] Find_Common_Elements ( int[] p1, int[] p2 ) {
        int count = 0;
        for ( int i = 0; i < p1.length; i++ ) {
            for ( int j = 0; j < p2.length; j++ ) {
                if ( p1[i] == p2[j] ) {
                    count++;
                    break;
                }
            }
        }
        int[] result = new int[count];
        count = 0;
        for ( int i = 0; i < p1.length; i++ ) {
            for ( int j = 0; j < p2.length; j++ ) {
                if ( p1[i] == p2[j] ) {
                    result[count++] = p1[i];
                    break;
                }
            }
        }
        return result;
    }
    static int[] BubbleSort ( int[] numarray ) {
        int max = numarray.length;
        for ( int i = 1; i < max; i++ ) {
            for ( int j = 0; j < max - i; j++ ) {
                if ( numarray[j] > numarray[j + 1] ) {
                    int temp = numarray[j];
                    numarray[j] = numarray[j + 1];
                    numarray[j + 1] = temp;
                }
            }
        }
        return numarray;
    }
    static int[] Find_Unique_Elements ( int[] numarray ) {
        BubbleSort ( numarray );
        int element = numarray[0];
        int count = 1;
        for ( int i = 1; i < numarray.length; i++ ) {
            if ( element == numarray[i] ) {
                continue;
            } else {
                element = numarray[i];
                count++;
            }
        }
        int[] result = new int[count];
        count = 0;
        element = numarray[0];
        result[count++] = element;
        for ( int i = 1; i < numarray.length; i++ ) {
            if ( element == numarray[i] ) {
                continue;
            } else {
                element = numarray[i];
                result[count++] = element;
            }
        }
        return result;
    }
    public static void main ( String[] args ) {
        int[] array1 = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100,
                                   95, 85, 75, 65, 55, 45, 35, 25, 15, 05,
                                   10, 15, 20, 25, 30, 35, 40, 45, 50, 55
                                 };
        int[] array2 = new int[] { 15, 25, 35, 45, 55,
                                   12, 22, 32, 43, 52,
                                   15, 25, 35, 45, 55
                                 };
        int [] p1 = Find_Unique_Elements ( array1 );
        int [] p2 = Find_Unique_Elements ( array2 );
        int [] result = Find_Common_Elements ( array1, array2 );
        System.out.print ( "\n\nUnique Sorted Elements in Array1: " );
        for ( int i = 0; i < p1.length; i++ ) {
            System.out.print ( p1[i] + " " );
        }
        System.out.print ( "\n\nUnique Sorted Elements in Array2: " );
        for ( int i = 0; i < p2.length; i++ ) {
            System.out.print ( p2[i] + " " );
        }
        System.out.print ( "\n\nCommon (Intersection of) Elements in Array1 and Array2: " );
        for ( int i = 0; i < result.length; i++ ) {
            System.out.print ( result[i] + " " );
        }
        System.out.println();
    }
}