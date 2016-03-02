public void fill(int row, int col){
    if (!checkRows() || !checkCols() || !checkDiags()) {
        return;
    }
    if (row == square.length) {
        System.out.println(this);
        numsquares++;
        return;
    }
    for (int i = 0; i < totalSqs; i++) {
        if (possible[i]) {
            square[row][col] = i + 1;
            possible[i] = false;
            int newcol = col + 1;
            int newrow = row;
            if (newcol == square.length) {
                newrow++;
                newcol = 0;
            }
            fill(newrow, newcol);
            square[row][col] = 0;
            possible[i] = true;
        }
    }
}