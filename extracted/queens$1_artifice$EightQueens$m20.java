private boolean m20(int v6, int v7){
    int v8;
    v8 = 0;
    while (v8 < v6) {
        if (Math.abs(v6 - v8) == Math.abs(f00[v8] - v7)) {
            return true;
        }
        v8 = v8 + 1;
    }
    return false;
}