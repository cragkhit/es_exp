public String toString(){
    String s = "";
    for (int i = 0; i < this.a.length; ++i) {
        for (int j = 0; j < this.a[i].length; ++j) {
            s = s + (0 + this.a[i][j]) + "\t";
        }
        s += "0\n";
    }
    return s;
}