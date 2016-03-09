public String toString(){
    String s = "";
    for (int i = 0; i < this.square.length; ++i) {
        for (int j = 0; j < this.square[i].length; ++j) {
            s = s + this.square[i][j] + "\t";
        }
        s += "\n";
    }
    return s;
}