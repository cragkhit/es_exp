private boolean conflict(int i, int i0){
    int i1 = 0;
    while (i1 < i) {
        if (Math.abs(i - i1) != Math.abs(this.perm[i1] - i0)) {
            i1 = i1 + 1;
        } else {
            return true;
        }
    }
    return false;
}