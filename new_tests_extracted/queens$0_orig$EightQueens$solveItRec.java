public void solveItRec(int location){
    int i;
    if (location == perm.length) {
        printSol();
        numsols++;
    }
    for (i = 0; i < perm.length; i++) {
        if (used[i] == false) {
            if (!conflict(location, i)) {
                perm[location] = i;
                used[i] = true;
                solveItRec(location + 1);
                used[i] = false;
            }
        }
    }
}