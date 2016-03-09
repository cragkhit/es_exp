public String toString(){
    String s = "";
    int i = 0;
    while (i < this.f00.length) {
        String s0 = s;
        int i0 = 0;
        while (i0 < this.f00[i].length) {
            String s1 = new StringBuilder().append(s0).append(0 + this.f00[i][i0]).append("\t").toString();
            int i1 = i0 + 1;
            s0 = s1;
            i0 = i1;
        }
        String s2 = new StringBuilder().append(s0).append("0\n").toString();
        int i2 = i + 1;
        s = s2;
        i = i2;
    }
    return s;
}