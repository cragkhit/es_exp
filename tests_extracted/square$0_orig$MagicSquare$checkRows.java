public boolean checkRows(){
    for (int i = 0; i < square.length; i++) {
        int test = 0;
        boolean unFilled = false;
        for (int j = 0; j < square[i].length; j++) {
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