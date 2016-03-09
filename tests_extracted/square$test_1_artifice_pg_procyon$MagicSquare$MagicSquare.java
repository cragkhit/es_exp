private MagicSquare(int i){
    super();
    this.a = new int[3][3];
    for (i = 0; i < 3; ++i) {
        for (int j = 0; j < 3; ++j) {
            this.a[i][j] = 0;
        }
    }
    this.c = 9;
    this.b = new boolean[this.c];
    for (int k = 0; k < this.c; ++k) {
        this.b[k] = true;
    }
    this.d = 15;
    this.e = 0;
}