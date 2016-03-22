public void fill(int i, int i0){
    if (this.checkRows() && this.checkCols() && this.checkDiags()) {
        if (i != this.square.length) {
            int i1 = 0;
            while (i1 < this.totalSqs) {
                if (this.possible[i1]) {
                    int i2 = 0;
                    int i3 = 0;
                    this.square[i][i0] = i1 + 1;
                    this.possible[i1] = false;
                    int i4 = i0 + 1;
                    if (i4 != this.square.length) {
                        i2 = i4;
                        i3 = i;
                    } else {
                        int i5 = i + 1;
                        i2 = 0;
                        i3 = i5;
                    }
                    this.fill(i3, i2);
                    this.square[i][i0] = 0;
                    this.possible[i1] = true;
                }
                i1 = i1 + 1;
            }
            return;
        } else {
            System.out.println((Object) this);
            this.numsquares = this.numsquares + 1;
            return;
        }
    }
}