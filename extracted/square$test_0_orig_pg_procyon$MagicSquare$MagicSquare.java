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
    for (i = 0; i < this.c; ++i) {
        this.b[i] = true;
    }
    this.d = 15;
    this.e = 0;
}