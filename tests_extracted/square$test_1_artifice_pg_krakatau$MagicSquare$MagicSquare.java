private MagicSquare(int i){
    super();
    this.a = new int[3][3];
    int i0 = 0;
    while (i0 < 3) {
        int i1 = 0;
        while (i1 < 3) {
            this.a[i0][i1] = 0;
            i1 = i1 + 1;
        }
        i0 = i0 + 1;
    }
    this.c = 9;
    this.b = new boolean[this.c];
    int i2 = 0;
    while (i2 < this.c) {
        this.b[i2] = true;
        i2 = i2 + 1;
    }
    this.d = 15;
    this.e = 0;
}