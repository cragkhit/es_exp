public boolean checkCols(){
    for (int j = 0; j < square[0].length; j++) {
        int test = 0;
        boolean unFilled = false;
        for (int i = 0; i < square.length; i++) {
            test += square[i][j];
            if (square[i][j] == 0) {
                unFilled = true;
            }
        }
        if (!unFilled && test != sum) {
            return false;
        }
    }
    return true;
}