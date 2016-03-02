public boolean m30(){
    int i = 0;
    int i0 = 0;
    int i1 = 0;
    while (i1 < this.f00.length) {
        int i2 = i + this.f00[i1][i1];
        int i3 = (this.f00[i1][i1] != 0) ? i0 : 1;
        int i4 = i1 + 1;
        i = i2;
        i0 = i3;
        i1 = i4;
    }
    if (i0 == 0 && i != this.f30) {
        return false;
    }
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    while (i7 < this.f00.length) {
        int i8 = i5 + this.f00[i7][this.f00.length - 1 - i7];
        int i9 = (this.f00[i7][this.f00.length - 1 - i7] != 0) ? i6 : 1;
        int i10 = i7 + 1;
        i5 = i8;
        i6 = i9;
        i7 = i10;
    }
    if (i6 == 0 && i5 != this.f30) {
        return false;
    }
    return true;
}