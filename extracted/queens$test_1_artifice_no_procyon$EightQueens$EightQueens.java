public EightQueens(final int n){
    super();
    this.f00 = new int[n];
    this.f10 = new boolean[n];
    this.f20 = 0;
    for (int i = 0; i < n; ++i) {
        this.f00[i] = -1;
        this.f10[i] = false;
    }
}