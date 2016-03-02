public boolean m10(){
    for (int i = 0; i < this.f00.length; ++i) {
        int n = 0;
        boolean b = false;
        for (int j = 0; j < this.f00[i].length; ++j) {
            n += this.f00[i][j];
            if (this.f00[i][j] == 0) {
                b = true;
            }
        }
        if (!b && n != this.f30) {
            return false;
        }
    }
    return true;
}