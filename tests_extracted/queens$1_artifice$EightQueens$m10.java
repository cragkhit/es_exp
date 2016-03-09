public void m10(int v4){
    int v5;
    if (v4 == f00.length) {
        m30();
        f20 = f20 + 1;
    }
    v5 = 0;
    while (v5 < f00.length) {
        if (f10[v5] == false) {
            if (!m20(v4, v5)) {
                f00[v4] = v5;
                f10[v5] = true;
                m10(v4 + 1);
                f10[v5] = false;
            }
        }
        v5 = v5 + 1;
    }
}