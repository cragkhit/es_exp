public boolean checkCols(){
    for (int i = 0; i < this.square[0].length; ++i) {
        int n = 0;
        boolean b = false;
        for (int j = 0; j < this.square.length; ++j) {
            n += this.square[j][i];
            if (this.square[j][i] == 0) {
                b = true;
            }
        }
        if (!b && n != this.sum) {
            return false;
        }
    }
    return true;
}