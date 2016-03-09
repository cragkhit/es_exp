public boolean checkDiags(){
    int n = 0;
    boolean b = false;
    for (int i = 0; i < this.square.length; ++i) {
        n += this.square[i][i];
        if (this.square[i][i] == 0) {
            b = true;
        }
    }
    if (!b && n != this.sum) {
        return false;
    }
    int n2 = 0;
    boolean b2 = false;
    for (int j = 0; j < this.square.length; ++j) {
        n2 += this.square[j][this.square.length - 1 - j];
        if (this.square[j][this.square.length - 1 - j] == 0) {
            b2 = true;
        }
    }
    return b2 || n2 == this.sum;
}