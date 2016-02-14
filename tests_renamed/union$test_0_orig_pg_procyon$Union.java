class Union {
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
        return array;
    }
    private static int[] b ( final int[] array ) {
        a ( array );
        int n = array[0];
        int n2 = 1;
        for ( int i = 1; i < array.length; ++i ) {
            if ( n != array[i] ) {
                n = array[i];
                ++n2;
            }
        }
        final int[] array2 = new int[n2];
        int n3 = 0;
        int n4 = array[0];
        final int[] array3 = array2;
        final int n5 = 0;
        ++n3;
        array3[n5] = n4;
        for ( int j = 1; j < array.length; ++j ) {
            if ( n4 != array[j] ) {
                n4 = array[j];
                array2[n3++] = n4;
            }
        }
        return array2;
    }
    public static void main ( final String[] array ) {
        final int[] array2 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 95, 85, 75, 65, 55, 45, 35, 25, 15, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55 };
        final int[] array3 = { 15, 25, 35, 45, 55, 12, 22, 32, 43, 52, 15, 25, 35, 45, 55 };
        final int[] b = b ( array2 );
        final int[] b2 = b ( array3 );
        final int[] array4 = b;
        final int[] array5 = b2;
        final int[] array6 = array4;
        final int[] array7 = array5;
        final int[] array8 = array4;
        int n = 0;
        for ( int i = 0; i < array8.length; ++i ) {
            for ( int j = 0; j < array7.length; ++j ) {
                if ( array8[i] == array7[j] ) {
                    ++n;
                    break;
                }
            }
        }
        final int[] array9 = new int[n];
        int n2 = 0;
        for ( int k = 0; k < array8.length; ++k ) {
            for ( int l = 0; l < array7.length; ++l ) {
                if ( array8[k] == array7[l] ) {
                    array9[n2++] = array8[k];
                    break;
                }
            }
        }
        final int[] array10 = array9;
        final int[] array11 = new int[array6.length + array5.length - array10.length];
        int n3 = 0;
        for ( int n4 = 0; n4 < array6.length; ++n4 ) {
            array11[n3++] = array6[n4];
        }
        for ( int n5 = 0; n5 < array5.length; ++n5 ) {
            int n6 = 1;
            for ( int n7 = 0; n7 < array10.length; ++n7 ) {
                if ( array10[n7] == array5[n5] ) {
                    n6 = 0;
                    break;
                }
            }
            if ( n6 == 1 ) {
                array11[n3++] = array5[n5];
            }
        }
        final int[] a = a ( array11 );
        System.out.print ( "\n\nUnique Sorted Elements in Array1: " );
        for ( int n8 = 0; n8 < b.length; ++n8 ) {
            System.out.print ( b[n8] + " " );
        }
        System.out.print ( "\n\nUnique Sorted Elements in Array2: " );
        for ( int n9 = 0; n9 < b2.length; ++n9 ) {
            System.out.print ( b2[n9] + " " );
        }
        System.out.print ( "\n\nUnion of Elements in Array1 and Array2: " );
        for ( int n10 = 0; n10 < a.length; ++n10 ) {
            System.out.print ( a[n10] + " " );
        }
        System.out.println();
    }
}
