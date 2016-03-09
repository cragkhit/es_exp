public EightQueens(final int n){
    super();
    this.perm = new int[n];
    this.used = new boolean[n];
    this.numsols = 0;
    for (int i = 0; i < n; ++i) {
        this.perm[i] = -1;
        this.used[i] = false;
    }
}