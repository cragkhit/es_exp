import java.io.*;
class Intersection {
    static int[] m00 ( int[] v0, int[] v1 ) {
        int v2;
        v2 = 0;
        int v3;
        v3 = 0;
        while ( v3 < v0.length ) {
            int v4;
            v4 = 0;
            while ( v4 < v1.length ) {
                if ( v0[v3] == v1[v4] ) {
                    v2 = v2 + 1;
                    break;
                }
                v4 = v4 + 1;
            }
            v3 = v3 + 1;
        }
        int[] v5;
        v5 = new int[v2];
        v2 = 0;
        int v6;
        v6 = 0;
        while ( v6 < v0.length ) {
            int v7;
            v7 = 0;
            while ( v7 < v1.length ) {
                if ( v0[v6] == v1[v7] ) {
                    v5[+v2] = v0[v6];
                    v2 = v2 + 1;
                    break;
                }
                v7 = v7 + 1;
            }
            v6 = v6 + 1;
        }
        return v5;
    }
    static int[] m10 ( int[] v8 ) {
        int v9;
        v9 = v8.length;
        int v10;
        v10 = 1;
        while ( v10 < v9 ) {
            int v11;
            v11 = 0;
            while ( v11 < v9 - v10 ) {
                if ( v8[v11] > v8[v11 + 1] ) {
                    int v12;
                    v12 = v8[v11];
                    v8[v11] = v8[v11 + 1];
                    v8[v11 + 1] = v12;
                }
                v11 = v11 + 1;
            }
            v10 = v10 + 1;
        }
        return v8;
    }
    static int[] m20 ( int[] v13 ) {
        m10 ( v13 );
        int v14;
        v14 = v13[0];
        int v15;
        v15 = 1;
        int v16;
        v16 = 1;
        while ( v16 < v13.length ) {
            if ( v14 == v13[v16] ) {
                continue;
            } else {
                v14 = v13[v16];
                v15 = v15 + 1;
            }
            v16 = v16 + 1;
        }
        int[] v17;
        v17 = new int[v15];
        v15 = 0;
        v14 = v13[0];
        v17[+v15] = v14;
        v15 = v15 + 1;
        int v18;
        v18 = 1;
        while ( v18 < v13.length ) {
            if ( v14 == v13[v18] ) {
                continue;
            } else {
                v14 = v13[v18];
                v17[+v15] = v14;
                v15 = v15 + 1;
            }
            v18 = v18 + 1;
        }
        return v17;
    }
    public static void main ( String[] v19 ) {
        int[] v20;
        v20 = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 95, 85,
                          75, 65, 55, 45, 35, 25, 15, 05, 10, 15, 20, 25, 30, 35, 40, 45,
                          50, 55
                        };
        int[] v21;
        v21 = new int[] { 15, 25, 35, 45, 55, 12, 22, 32, 43, 52, 15, 25,
                          35, 45, 55
                        };
        int[] v22;
        v22 = m20 ( v20 );
        int[] v23;
        v23 = m20 ( v21 );
        int[] v24;
        v24 = m00 ( v20, v21 );
        System.out.print ( "\n\nUnique Sorted Elements in Array1: " );
        int v25;
        v25 = 0;
        while ( v25 < v22.length ) {
            System.out.print ( v22[v25] + " " );
            v25 = v25 + 1;
        }
        System.out.print ( "\n\nUnique Sorted Elements in Array2: " );
        int v26;
        v26 = 0;
        while ( v26 < v23.length ) {
            System.out.print ( v23[v26] + " " );
            v26 = v26 + 1;
        }
        System.out.print ( "\n\nCommon (Intersection of) Elements in Array1 and Array2: " );
        int v27;
        v27 = 0;
        while ( v27 < v24.length ) {
            System.out.print ( v24[v27] + " " );
            v27 = v27 + 1;
        }
        System.out.println();
    }
}