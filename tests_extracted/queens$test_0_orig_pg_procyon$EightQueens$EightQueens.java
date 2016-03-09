private EightQueens(int i){
    super();
    this.a = new int[5];
    this.b = new boolean[5];
    this.c = 0;
    for (i = 0; i < 5; ++i) {
        this.a[i] = -1;
        this.b[i] = false;
    }
}