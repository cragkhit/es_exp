public String toString(){
    String v23;
    v23 = "";
    int v24;
    v24 = 0;
    while (v24 < f00.length) {
        int v25;
        v25 = 0;
        while (v25 < f00[v24].length) {
            v23 += 0 + f00[v24][v25] + "\t";
            v25 = v25 + 1;
        }
        v23 += 0 + "\n";
        v24 = v24 + 1;
    }
    return v23;
}