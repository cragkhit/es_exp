private boolean conflict(final int n, final int n2){
    for (int i = 0; i < n; ++i) {
        if (Math.abs(n - i) == Math.abs(this.perm[i] - n2)) {
            return true;
        }
    }
    return false;
}