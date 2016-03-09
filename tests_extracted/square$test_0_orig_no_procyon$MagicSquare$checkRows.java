public boolean checkRows(){
    for (int i = 0; i < this.square.length; ++i) {
        int n = 0;
        boolean b = false;
        for (int j = 0; j < this.square[i].length; ++j) {
            n += this.square[i][j];
            if (this.square[i][j] == 0) {
                b = true;
            }
        }
        if (!b && n != this.sum) {
            return false;
        }
    }
    return true;
}