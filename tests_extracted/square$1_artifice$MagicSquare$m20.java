public boolean m20(){
    int v15;
    v15 = 0;
    while (v15 < f00[0].length) {
        int v16;
        v16 = 0;
        boolean v17;
        v17 = false;
        int v18;
        v18 = 0;
        while (v18 < f00.length) {
            v16 = v16 + (f00[v18][v15]);
            if (f00[v18][v15] == 0) {
                v17 = true;
            }
            v18 = v18 + 1;
        }
        if (!v17 && v16 != f30) {
            return false;
        }
        v15 = v15 + 1;
    }
    return true;
}