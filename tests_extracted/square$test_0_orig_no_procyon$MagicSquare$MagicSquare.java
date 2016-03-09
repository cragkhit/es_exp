public MagicSquare(final int n){
    super();
    this.square = new int[n][n];
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            this.square[i][j] = 0;
        }
    }
    this.totalSqs = n * n;
    this.possible = new boolean[this.totalSqs];
    for (int k = 0; k < this.totalSqs; ++k) {
        this.possible[k] = true;
    }
    this.sum = n * (n * n + 1) / 2;
    this.numsquares = 0;
}