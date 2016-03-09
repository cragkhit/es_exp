public MagicSquare(final int n){
    super();
    this.f00 = new int[n][n];
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            this.f00[i][j] = 0;
        }
    }
    this.f20 = n * n;
    this.f10 = new boolean[this.f20];
    for (int k = 0; k < this.f20; ++k) {
        this.f10[k] = true;
    }
    this.f30 = n * (n * n + 1) / 2;
    this.f40 = 0;
}