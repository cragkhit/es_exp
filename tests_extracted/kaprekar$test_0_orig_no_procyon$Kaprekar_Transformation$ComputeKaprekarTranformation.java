static int ComputeKaprekarTranformation(final int n){
    final int n2 = n / 100;
    final int n3 = (n - n2 * 100) / 10;
    final int n4 = n % 10;
    int n5;
    int n6;
    int n7;
    if (n2 > n3) {
        if (n2 > n4) {
            n5 = n2;
            if (n3 > n4) {
                n6 = n3;
                n7 = n4;
            } else {
                n7 = n3;
                n6 = n4;
            }
        } else {
            n5 = n4;
            n6 = n2;
            n7 = n3;
        }
    } else if (n3 > n4) {
        n5 = n3;
        if (n2 > n4) {
            n6 = n2;
            n7 = n4;
        } else {
            n7 = n2;
            n6 = n4;
        }
    } else {
        n5 = n4;
        n6 = n3;
        n7 = n2;
    }
    int n8;
    int n9;
    int n10;
    if (n2 < n3) {
        if (n2 < n4) {
            n8 = n2;
            if (n3 < n4) {
                n9 = n3;
                n10 = n4;
            } else {
                n10 = n3;
                n9 = n4;
            }
        } else {
            n8 = n4;
            n9 = n2;
            n10 = n3;
        }
    } else if (n3 < n4) {
        n8 = n3;
        if (n2 < n4) {
            n9 = n2;
            n10 = n4;
        } else {
            n10 = n2;
            n9 = n4;
        }
    } else {
        n8 = n4;
        n9 = n3;
        n10 = n2;
    }
    final int i = n5 * 100 + n6 * 10 + n7;
    final int j = n8 * 100 + n9 * 10 + n10;
    final int k = i - j;
    System.out.format("%d - %d = %d\n", i, j, k);
    return k;
}