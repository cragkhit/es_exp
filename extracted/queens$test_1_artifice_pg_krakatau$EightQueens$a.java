private void a(int i){
    if (i == this.a.length) {
        System.out.println("Here is a solution:\n");
        int i0 = 0;
        while (i0 < this.a.length) {
            int i1 = 0;
            while (i1 < this.a.length) {
                if (this.a[i1] != i0) {
                    System.out.print("_ ");
                } else {
                    System.out.print("Q ");
                }
                i1 = i1 + 1;
            }
            System.out.println("\n");
            i0 = i0 + 1;
        }
        this.c = this.c + 1;
    }
    int i2 = 0;
    while (i2 < this.a.length) {
        if (!this.b[i2]) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= i) {
                    i3 = 0;
                    break;
                } else {
                    if (Math.abs(i - i4) != Math.abs(this.a[i4] - i2)) {
                        i4 = i4 + 1;
                        continue;
                    }
                    i3 = 1;
                    break;
                }
            }
            if (i3 == 0) {
                this.a[i] = i2;
                this.b[i2] = true;
                this.a(i + 1);
                this.b[i2] = false;
            }
        }
        i2 = i2 + 1;
    }
}