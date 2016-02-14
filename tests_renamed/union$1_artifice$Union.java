import java.io.*;
class Union {
    static int[] m02 ( int[] v0, int[] v1 ) {
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
    static int[] m12 ( int[] v8, int[] v9 ) {
        int[] v10;
        v10 = m02 ( v8, v9 );
        int v11;
        v11 = v8.length + v9.length - v10.length;
        int[] v12;
        v12 = new int[v11];
        v11 = 0;
        int v13;
        v13 = 0;
        while ( v13 < v8.length ) {
            v12[+v11] = v8[v13];
            v11 = v11 + 1;
            v13 = v13 + 1;
        }
        int v14;
        v14 = 0;
        while ( v14 < v9.length ) {
            boolean v15;
            v15 = true;
            int v16;
            v16 = 0;
            while ( v16 < v10.length ) {
                if ( v10[v16] == v9[v14] ) {
                    v15 = false;
                    break;
                }
                v16 = v16 + 1;
            }
            if ( v15 == true ) {
                v12[+v11] = v9[v14];
                v11 = v11 + 1;
            }
            v14 = v14 + 1;
        }
        return m22 ( v12 );
    }
    static int[] m22 ( int[] v17 ) {
        int v18;
        v18 = v17.length;
        int v19;
        v19 = 1;
        while ( v19 < v18 ) {
            int v20;
            v20 = 0;
            while ( v20 < v18 - v19 ) {
                if ( v17[v20] > v17[v20 + 1] ) {
                    int v21;
                    v21 = v17[v20];
                    v17[v20] = v17[v20 + 1];
                    v17[v20 + 1] = v21;
                }
                v20 = v20 + 1;
            }
            v19 = v19 + 1;
        }
        return v17;
    }
    static int[] m32 ( int[] v22 ) {
        m22 ( v22 );
        int v23;
        v23 = v22[0];
        int v24;
        v24 = 1;
        int v25;
        v25 = 1;
        while ( v25 < v22.length ) {
            if ( v23 == v22[v25] ) {
                continue;
            } else {
                v23 = v22[v25];
                v24 = v24 + 1;
            }
            v25 = v25 + 1;
        }
        int[] v26;
        v26 = new int[v24];
        v24 = 0;
        v23 = v22[0];
        v26[+v24] = v23;
        v24 = v24 + 1;
        int v27;
        v27 = 1;
        while ( v27 < v22.length ) {
            if ( v23 == v22[v27] ) {
                continue;
            } else {
                v23 = v22[v27];
                v26[+v24] = v23;
                v24 = v24 + 1;
            }
            v27 = v27 + 1;
        }
        return v26;
    }
    public static void main ( String[] v28 ) {
        int[] v29;
        v29 = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 95, 85,
                          75, 65, 55, 45, 35, 25, 15, 05, 10, 15, 20, 25, 30, 35, 40, 45,
                          50, 55
                        };
        int[] v30;
        v30 = new int[] { 15, 25, 35, 45, 55, 12, 22, 32, 43, 52, 15, 25,
                          35, 45, 55
                        };
        int[] v31;
        v31 = m32 ( v29 );
        int[] v32;
        v32 = m32 ( v30 );
        int[] v33;
        v33 = m12 ( v31, v32 );
        System.out.print ( "\n\nUnique Sorted Elements in Array1: " );
        int v34;
        v34 = 0;
        while ( v34 < v31.length ) {
            System.out.print ( v31[v34] + " " );
            v34 = v34 + 1;
        }
        System.out.print ( "\n\nUnique Sorted Elements in Array2: " );
        int v35;
        v35 = 0;
        while ( v35 < v32.length ) {
            System.out.print ( v32[v35] + " " );
            v35 = v35 + 1;
        }
        System.out.print ( "\n\nUnion of Elements in Array1 and Array2: " );
        int v36;
        v36 = 0;
        while ( v36 < v33.length ) {
            System.out.print ( v33[v36] + " " );
            v36 = v36 + 1;
        }
        System.out.println();
    }
}