public boolean checkDiags(){
    int i = 0;
    int i0 = 0;
    int i1 = 0;
    while (i1 < this.square.length) {
        int i2 = i + this.square[i1][i1];
        int i3 = (this.square[i1][i1] != 0) ? i0 : 1;
        int i4 = i1 + 1;
        i = i2;
        i0 = i3;
        i1 = i4;
    }
    if (i0 == 0 && i != this.sum) {
        return false;
    }
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    while (i7 < this.square.length) {
        int i8 = i5 + this.square[i7][this.square.length - 1 - i7];
        int i9 = (this.square[i7][this.square.length - 1 - i7] != 0) ? i6 : 1;
        int i10 = i7 + 1;
        i5 = i8;
        i6 = i9;
        i7 = i10;
    }
    if (i6 == 0 && i5 != this.sum) {
        return false;
    }
    return true;
}