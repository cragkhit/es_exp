public boolean m30(){
    int n = 0;
    boolean b = false;
    for (int i = 0; i < this.f00.length; ++i) {
        n += this.f00[i][i];
        if (this.f00[i][i] == 0) {
            b = true;
        }
    }
    if (!b && n != this.f30) {
        return false;
    }
    int n2 = 0;
    boolean b2 = false;
    for (int j = 0; j < this.f00.length; ++j) {
        n2 += this.f00[j][this.f00.length - 1 - j];
        if (this.f00[j][this.f00.length - 1 - j] == 0) {
            b2 = true;
        }
    }
    return b2 || n2 == this.f30;
}