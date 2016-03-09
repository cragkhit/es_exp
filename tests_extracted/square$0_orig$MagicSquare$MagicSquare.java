public MagicSquare(int n){
    square = new int[n][n];
    for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) {
        square[i][j] = 0;
    }
    totalSqs = n * n;
    possible = new boolean[totalSqs];
    for (int i = 0; i < totalSqs; i++) {
        possible[i] = true;
    }
    sum = n * (n * n + 1) / 2;
    numsquares = 0;
}