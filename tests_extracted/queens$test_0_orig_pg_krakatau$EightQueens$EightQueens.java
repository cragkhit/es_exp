private EightQueens(int i){
    super();
    this.a = new int[5];
    this.b = new boolean[5];
    this.c = 0;
    int i0 = 0;
    while (i0 < 5) {
        this.a[i0] = -1;
        this.b[i0] = false;
        i0 = i0 + 1;
    }
}