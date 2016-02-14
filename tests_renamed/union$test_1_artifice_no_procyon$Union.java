class Union {
    static int[] m02 ( final int[] array, final int[] array2 ) {
        int n = 0;
        for ( int i = 0; i < array.length; ++i ) {
            for ( int j = 0; j < array2.length; ++j ) {
                if ( array[i] == array2[j] ) {
                    ++n;
                    break;
                }
            }
        }
        final int[] array3 = new int[n];
        int n2 = 0;
        for ( int k = 0; k < array.length; ++k ) {
            for ( int l = 0; l < array2.length; ++l ) {
                if ( array[k] == array2[l] ) {
                    array3[n2] = array[k];
                    ++n2;
                    break;
                }
            }
        }
        return array3;
    }
    static int[] m12 ( final int[] array, final int[] array2 ) {
        final int[] m02 = m02 ( array, array2 );
        final int[] array3 = new int[array.length + array2.length - m02.length];
        int n = 0;
        for ( int i = 0; i < array.length; ++i ) {
            array3[n] = array[i];
            ++n;
        }
        for ( int j = 0; j < array2.length; ++j ) {
            int n2 = 1;
            for ( int k = 0; k < m02.length; ++k ) {
                if ( m02[k] == array2[j] ) {
                    n2 = 0;
                    break;
                }
            }
            if ( n2 == 1 ) {
                array3[n] = array2[j];
                ++n;
            }
        }
        return m22 ( array3 );
    }
    static int[] m22 ( final int[] array ) {
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
    static int[] m32 ( final int[] array ) {
        m22 ( array );
        int n = array[0];
        int n2 = 1;
        int i = 1;
        while ( i < array.length ) {
            if ( n == array[i] ) {
                continue;
            }
            n = array[i];
            ++n2;
            ++i;
        }
        final int[] array2 = new int[n2];
        final int n3 = 0;
        int n4 = array[0];
        array2[n3] = n4;
        int n5 = n3 + 1;
        int j = 1;
        while ( j < array.length ) {
            if ( n4 == array[j] ) {
                continue;
            }
            n4 = array[j];
            array2[n5] = n4;
            ++n5;
            ++j;
        }
        return array2;
    }
    public static void main ( final String[] array ) {
        final int[] array2 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 95, 85, 75, 65, 55, 45, 35, 25, 15, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55 };
        final int[] array3 = { 15, 25, 35, 45, 55, 12, 22, 32, 43, 52, 15, 25, 35, 45, 55 };
        final int[] m32 = m32 ( array2 );
        final int[] m2 = m32 ( array3 );
        final int[] m3 = m12 ( m32, m2 );
        System.out.print ( "\n\nUnique Sorted Elements in Array1: " );
        for ( int i = 0; i < m32.length; ++i ) {
            System.out.print ( m32[i] + " " );
        }
        System.out.print ( "\n\nUnique Sorted Elements in Array2: " );
        for ( int j = 0; j < m2.length; ++j ) {
            System.out.print ( m2[j] + " " );
        }
        System.out.print ( "\n\nUnion of Elements in Array1 and Array2: " );
        for ( int k = 0; k < m3.length; ++k ) {
            System.out.print ( m3[k] + " " );
        }
        System.out.println();
    }
}
