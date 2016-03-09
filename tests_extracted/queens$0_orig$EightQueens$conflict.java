private boolean conflict(int location, int row){
    int i;
    for (i = 0; i < location; i++) if (Math.abs(location - i) == Math.abs(perm[i] - row)) {
        return true;
    }
    return false;
}