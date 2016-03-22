public MagicSquare(int v2){
    f00 = new int[v2][v2];
    int v3;
    v3 = 0;
    while (v3 < v2) {
        int v4;
        v4 = 0;
        while (v4 < v2) {
            f00[v3][v4] = 0;
            v4 = v4 + 1;
        }
        v3 = v3 + 1;
    }
    f20 = v2 * v2;
    f10 = new boolean[f20];
    int v5;
    v5 = 0;
    while (v5 < f20) {
        f10[v5] = true;
        v5 = v5 + 1;
    }
    f30 = v2 * (v2 * v2 + 1) / 2;
    f40 = 0;
}