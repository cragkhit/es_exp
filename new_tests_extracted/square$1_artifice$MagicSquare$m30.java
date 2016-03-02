public boolean m30(){
    int v19;
    v19 = 0;
    boolean v20;
    v20 = false;
    int v21;
    v21 = 0;
    while (v21 < f00.length) {
        v19 = v19 + (f00[v21][v21]);
        if (f00[v21][v21] == 0) {
            v20 = true;
        }
        v21 = v21 + 1;
    }
    if (!v20 && v19 != f30) {
        return false;
    }
    v19 = 0;
    v20 = false;
    int v22;
    v22 = 0;
    while (v22 < f00.length) {
        v19 = v19 + (f00[v22][f00.length - 1 - v22]);
        if (f00[v22][f00.length - 1 - v22] == 0) {
            v20 = true;
        }
        v22 = v22 + 1;
    }
    if (!v20 && v19 != f30) {
        return false;
    }
    return true;
}