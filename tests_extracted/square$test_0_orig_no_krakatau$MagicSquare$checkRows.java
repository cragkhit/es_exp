public boolean checkRows(){
    int i = 0;
    while (i < this.square.length) {
        int i0 = 0;
        int i1 = 0;
        int i2 = 0;
        while (i2 < this.square[i].length) {
            int i3 = i0 + this.square[i][i2];
            int i4 = (this.square[i][i2] != 0) ? i1 : 1;
            int i5 = i2 + 1;
            i0 = i3;
            i1 = i4;
            i2 = i5;
        }
        if (i1 == 0 && i0 != this.sum) {
            return false;
        }
        i = i + 1;
    }
    return true;
}