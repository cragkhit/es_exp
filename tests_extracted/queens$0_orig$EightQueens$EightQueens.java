public EightQueens(int n){
    perm = new int[n];
    used = new boolean[n];
    numsols = 0;
    for (int i = 0; i < n; i++) {
        perm[i] = -1;
        used[i] = false;
    }
}