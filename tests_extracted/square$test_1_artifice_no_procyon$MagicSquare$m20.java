public boolean m20(){
    for (int i = 0; i < this.f00[0].length; ++i) {
        int n = 0;
        boolean b = false;
        for (int j = 0; j < this.f00.length; ++j) {
            n += this.f00[j][i];
            if (this.f00[j][i] == 0) {
                b = true;
            }
        }
        if (!b && n != this.f30) {
            return false;
        }
    }
    return true;
}