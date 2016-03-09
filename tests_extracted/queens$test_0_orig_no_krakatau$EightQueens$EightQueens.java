public EightQueens(int i){
    super();
    this.perm = new int[i];
    this.used = new boolean[i];
    this.numsols = 0;
    int i0 = 0;
    while (i0 < i) {
        this.perm[i0] = -1;
        this.used[i0] = false;
        i0 = i0 + 1;
    }
}