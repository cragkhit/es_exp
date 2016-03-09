public String toString(){
    String s = "";
    for (int i = 0; i < this.f00.length; ++i) {
        for (int j = 0; j < this.f00[i].length; ++j) {
            s = s + (0 + this.f00[i][j]) + "\t";
        }
        s += "0\n";
    }
    return s;
}