public void solveItRec(final int n){
    if (n == this.perm.length) {
        this.printSol();
        ++this.numsols;
    }
    for (int i = 0; i < this.perm.length; ++i) {
        if (!this.used[i] && !this.conflict(n, i)) {
            this.perm[n] = i;
            this.used[i] = true;
            this.solveItRec(n + 1);
            this.used[i] = false;
        }
    }
}