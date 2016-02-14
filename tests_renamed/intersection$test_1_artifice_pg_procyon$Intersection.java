class Intersection {
    private static int[] a ( final int[] array ) {
        for ( int length = array.length, i = 1; i < length; ++i ) {
            for ( int j = 0; j < length - i; ++j ) {
                if ( array[j] > array[j + 1] ) {
                    final int n = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = n;
                }
            }
        }
        int n2 = array[0];
        int n3 = 1;
        for ( int k = 1; k < array.length; ++k ) {
            if ( n2 != array[k] ) {
                n2 = array[k];
                ++n3;
            }
        }
        final int[] array2 = new int[n3];
        int n4 = array[0];
        array2[0] = n4;
        int n5 = 1;
        for ( int l = 1; l < array.length; ++l ) {
            if ( n4 != array[l] ) {
                n4 = array[l];
                array2[n5] = n4;
                ++n5;
            }
        }
        return array2;
    }
    public static void main ( final String[] array ) {
        final int[] array2 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 95, 85, 75, 65, 55, 45, 35, 25, 15, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55 };
        final int[] array3 = { 15, 25, 35, 45, 55, 12, 22, 32, 43, 52, 15, 25, 35, 45, 55 };
        final int[] a = a ( array2 );
        final int[] a2 = a ( array3 );
        final int[] array4 = array2;
        final int[] array5 = array3;
        final int[] array6 = array4;
        int n = 0;
        for ( int i = 0; i < 30; ++i ) {
            for ( int j = 0; j < 15; ++j ) {
                if ( array6[i] == array5[j] ) {
                    ++n;
                    break;
                }
            }
        }
        final int[] array7 = new int[n];
        int n2 = 0;
        for ( int k = 0; k < 30; ++k ) {
            for ( int l = 0; l < 15; ++l ) {
                if ( array6[k] == array5[l] ) {
                    array7[n2] = array6[k];
                    ++n2;
                    break;
                }
            }
        }
        final int[] array8 = array7;
        System.out.print ( "\n\nUnique Sorted Elements in Array1: " );
        for ( int n3 = 0; n3 < a.length; ++n3 ) {
            System.out.print ( a[n3] + " " );
        }
        System.out.print ( "\n\nUnique Sorted Elements in Array2: " );
        for ( int n4 = 0; n4 < a2.length; ++n4 ) {
            System.out.print ( a2[n4] + " " );
        }
        System.out.print ( "\n\nCommon (Intersection of) Elements in Array1 and Array2: " );
        for ( int n5 = 0; n5 < array8.length; ++n5 ) {
            System.out.print ( array8[n5] + " " );
        }
        System.out.println();
    }
}
