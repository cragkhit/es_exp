public void fill(final int n, final int n2){
    if (!this.checkRows() || !this.checkCols() || !this.checkDiags()) {
        return;
    }
    if (n == this.square.length) {
        System.out.println(this);
        ++this.numsquares;
        return;
    }
    for (int i = 0; i < this.totalSqs; ++i) {
        if (this.possible[i]) {
            this.square[n][n2] = i + 1;
            this.possible[i] = false;
            int n3 = n2 + 1;
            int n4 = n;
            if (n3 == this.square.length) {
                ++n4;
                n3 = 0;
            }
            this.fill(n4, n3);
            this.square[n][n2] = 0;
            this.possible[i] = true;
        }
    }
}