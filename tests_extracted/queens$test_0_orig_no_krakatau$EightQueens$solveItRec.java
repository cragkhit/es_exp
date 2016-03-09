public void solveItRec(int i){
    if (i == this.perm.length) {
        this.printSol();
        this.numsols = this.numsols + 1;
    }
    int i0 = 0;
    while (i0 < this.perm.length) {
        if (!this.used[i0] && !this.conflict(i, i0)) {
            this.perm[i] = i0;
            this.used[i0] = true;
            this.solveItRec(i + 1);
            this.used[i0] = false;
        }
        i0 = i0 + 1;
    }
}