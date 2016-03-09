public MagicSquare(int i){
    super();
    this.square = new int[i][i];
    int i0 = 0;
    while (i0 < i) {
        int i1 = 0;
        while (i1 < i) {
            this.square[i0][i1] = 0;
            i1 = i1 + 1;
        }
        i0 = i0 + 1;
    }
    this.totalSqs = i * i;
    this.possible = new boolean[this.totalSqs];
    int i2 = 0;
    while (i2 < this.totalSqs) {
        this.possible[i2] = true;
        i2 = i2 + 1;
    }
    this.sum = i * (i * i + 1) / 2;
    this.numsquares = 0;
}