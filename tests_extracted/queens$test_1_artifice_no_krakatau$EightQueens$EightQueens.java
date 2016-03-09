public EightQueens(int i){
    super();
    this.f00 = new int[i];
    this.f10 = new boolean[i];
    this.f20 = 0;
    int i0 = 0;
    while (i0 < i) {
        this.f00[i0] = -1;
        this.f10[i0] = false;
        i0 = i0 + 1;
    }
}