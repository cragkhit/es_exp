public EightQueens(int v2){
    f00 = new int[v2];
    f10 = new boolean[v2];
    f20 = 0;
    int v3;
    v3 = 0;
    while (v3 < v2) {
        f00[v3] = -1;
        f10[v3] = false;
        v3 = v3 + 1;
    }
}