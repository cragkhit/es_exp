public boolean m10(){
    int v11;
    v11 = 0;
    while (v11 < f00.length) {
        int v12;
        v12 = 0;
        boolean v13;
        v13 = false;
        int v14;
        v14 = 0;
        while (v14 < f00[v11].length) {
            v12 = v12 + (f00[v11][v14]);
            if (f00[v11][v14] == 0) {
                v13 = true;
            }
            v14 = v14 + 1;
        }
        if (!v13 && v12 != f30) {
            return false;
        }
        v11 = v11 + 1;
    }
    return true;
}