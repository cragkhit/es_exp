class Union {
    Union() {
        super();
    }
    static int[] m02 ( int[] a, int[] a0 ) {
        int i = 0;
        int i0 = 0;
        while ( i0 < a.length ) {
            int i1 = 0;
            while ( true ) {
                if ( i1 < a0.length ) {
                    if ( a[i0] != 0 != ( a0[i1] != 0 ) ) {
                        i1 = i1 + 1;
                        continue;
                    }
                    i = i + 1;
                }
                i0 = i0 + 1;
                break;
            }
        }
        int[] a1 = new int[i];
        int i2 = 0;
        int i3 = 0;
        while ( i3 < a.length ) {
            int i4 = 0;
            while ( true ) {
                if ( i4 < a0.length ) {
                    if ( a[i3] != 0 != ( a0[i4] != 0 ) ) {
                        i4 = i4 + 1;
                        continue;
                    }
                    a1[i2] = ( a[i3] != 0 ) ? 1 : 0;
                    i2 = i2 + 1;
                }
                i3 = i3 + 1;
                break;
            }
        }
        return a1;
    }
    static int[] m12 ( int[] a, int[] a0 ) {
        int[] a1 = Union.m02 ( a, a0 );
        int[] a2 = new int[a.length + a0.length - a1.length];
        int i = 0;
        int i0 = 0;
        while ( i0 < a.length ) {
            a2[i] = ( a[i0] != 0 ) ? 1 : 0;
            i = i + 1;
            i0 = i0 + 1;
        }
        int i1 = 0;
        while ( i1 < a0.length ) {
            int i2 = 0;
            while ( true ) {
                boolean b = false;
                if ( i2 >= a1.length ) {
                    b = true;
                } else {
                    if ( a1[i2] != 0 != ( a0[i1] != 0 ) ) {
                        i2 = i2 + 1;
                        continue;
                    }
                    b = false;
                }
                if ( b ) {
                    a2[i] = ( a0[i1] != 0 ) ? 1 : 0;
                    i = i + 1;
                }
                i1 = i1 + 1;
                break;
            }
        }
        return Union.m22 ( a2 );
    }
    static int[] m22 ( int[] a ) {
        int i = a.length;
        int i0 = 1;
        while ( i0 < i ) {
            int i1 = 0;
            while ( i1 < i - i0 ) {
                if ( ( a[i1] != 0 ) > ( a[i1 + 1] != 0 ) ) {
                    boolean b = a[i1] != 0;
                    a[i1] = ( a[i1 + 1] != 0 ) ? 1 : 0;
                    a[i1 + 1] = b ? 1 : 0;
                }
                i1 = i1 + 1;
            }
            i0 = i0 + 1;
        }
        return a;
    }
    static int[] m32 ( int[] a ) {
        Union.m22 ( a );
        boolean b = a[0] != 0;
        int i = 1;
        int i0 = 1;
        while ( i0 < a.length ) {
            if ( b != ( a[i0] != 0 ) ) {
                b = a[i0] != 0;
                i = i + 1;
                i0 = i0 + 1;
            }
        }
        int[] a0 = new int[i];
        boolean b0 = a[0] != 0;
        a0[0] = b0 ? 1 : 0;
        int i1 = 1;
        int i2 = 1;
        while ( i2 < a.length ) {
            if ( b0 != ( a[i2] != 0 ) ) {
                b0 = a[i2] != 0;
                a0[i1] = b0 ? 1 : 0;
                i1 = i1 + 1;
                i2 = i2 + 1;
            }
        }
        return a0;
    }
    public static void main ( String[] a ) {
        int[] a0 = new int[30];
        a0[0] = 10;
        a0[1] = 20;
        a0[2] = 30;
        a0[3] = 40;
        a0[4] = 50;
        a0[5] = 60;
        a0[6] = 70;
        a0[7] = 80;
        a0[8] = 90;
        a0[9] = 100;
        a0[10] = 95;
        a0[11] = 85;
        a0[12] = 75;
        a0[13] = 65;
        a0[14] = 55;
        a0[15] = 45;
        a0[16] = 35;
        a0[17] = 25;
        a0[18] = 15;
        a0[19] = 5;
        a0[20] = 10;
        a0[21] = 15;
        a0[22] = 20;
        a0[23] = 25;
        a0[24] = 30;
        a0[25] = 35;
        a0[26] = 40;
        a0[27] = 45;
        a0[28] = 50;
        a0[29] = 55;
        int[] a1 = new int[15];
        a1[0] = 15;
        a1[1] = 25;
        a1[2] = 35;
        a1[3] = 45;
        a1[4] = 55;
        a1[5] = 12;
        a1[6] = 22;
        a1[7] = 32;
        a1[8] = 43;
        a1[9] = 52;
        a1[10] = 15;
        a1[11] = 25;
        a1[12] = 35;
        a1[13] = 45;
        a1[14] = 55;
        int[] a2 = Union.m32 ( a0 );
        int[] a3 = Union.m32 ( a1 );
        int[] a4 = Union.m12 ( a2, a3 );
        System.out.print ( "\n\nUnique Sorted Elements in Array1: " );
        int i = 0;
        while ( i < a2.length ) {
            System.out.print ( new StringBuilder().append ( ( a2[i] != 0 ) ? 1 : 0 ).append ( " " ).toString() );
            i = i + 1;
        }
        System.out.print ( "\n\nUnique Sorted Elements in Array2: " );
        int i0 = 0;
        while ( i0 < a3.length ) {
            System.out.print ( new StringBuilder().append ( ( a3[i0] != 0 ) ? 1 : 0 ).append ( " " ).toString() );
            i0 = i0 + 1;
        }
        System.out.print ( "\n\nUnion of Elements in Array1 and Array2: " );
        int i1 = 0;
        while ( i1 < a4.length ) {
            System.out.print ( new StringBuilder().append ( ( a4[i1] != 0 ) ? 1 : 0 ).append ( " " ).toString() );
            i1 = i1 + 1;
        }
        System.out.println();
    }
}