public boolean checkDiags(){
    int test = 0;
    boolean unFilled = false;
    for (int i = 0; i < square.length; i++) {
        test += square[i][i];
        if (square[i][i] == 0) {
            unFilled = true;
        }
    }
    if (!unFilled && test != sum) {
        return false;
    }
    test = 0;
    unFilled = false;
    for (int i = 0; i < square.length; i++) {
        test += square[i][square.length - 1 - i];
        if (square[i][square.length - 1 - i] == 0) {
            unFilled = true;
        }
    }
    if (!unFilled && test != sum) {
        return false;
    }
    return true;
}