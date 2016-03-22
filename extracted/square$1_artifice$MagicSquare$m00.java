public void m00(int v6, int v7){
    if (!m10() || !m20() || !m30()) {
        return;
    }
    if (v6 == f00.length) {
        System.out.println(this);
        f40 = f40 + 1;
        return;
    }
    int v8;
    v8 = 0;
    while (v8 < f20) {
        if (f10[v8]) {
            f00[v6][v7] = v8 + 1;
            f10[v8] = false;
            int v9;
            v9 = v7 + 1;
            int v10;
            v10 = v6;
            if (v9 == f00.length) {
                v10 = v10 + 1;
                v9 = 0;
            }
            m00(v10, v9);
            f00[v6][v7] = 0;
            f10[v8] = true;
        }
        v8 = v8 + 1;
    }
}