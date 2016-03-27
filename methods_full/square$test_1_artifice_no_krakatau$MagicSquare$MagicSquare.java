public MagicSquare(int i){
    super();
    this.f00 = new int[i][i];
    int i0 = 0;
    while (i0 < i) {
        int i1 = 0;
        while (i1 < i) {
            this.f00[i0][i1] = 0;
            i1 = i1 + 1;
        }
        i0 = i0 + 1;
    }
    this.f20 = i * i;
    this.f10 = new boolean[this.f20];
    int i2 = 0;
    while (i2 < this.f20) {
        this.f10[i2] = true;
        i2 = i2 + 1;
    }
    this.f30 = i * (i * i + 1) / 2;
    this.f40 = 0;
}