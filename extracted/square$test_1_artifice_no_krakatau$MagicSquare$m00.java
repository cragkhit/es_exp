public void m00(int i, int i0){
    if (this.m10() && this.m20() && this.m30()) {
        if (i != this.f00.length) {
            int i1 = 0;
            while (i1 < this.f20) {
                if (this.f10[i1]) {
                    int i2 = 0;
                    int i3 = 0;
                    this.f00[i][i0] = i1 + 1;
                    this.f10[i1] = false;
                    int i4 = i0 + 1;
                    if (i4 != this.f00.length) {
                        i2 = i4;
                        i3 = i;
                    } else {
                        int i5 = i + 1;
                        i2 = 0;
                        i3 = i5;
                    }
                    this.m00(i3, i2);
                    this.f00[i][i0] = 0;
                    this.f10[i1] = true;
                }
                i1 = i1 + 1;
            }
            return;
        } else {
            System.out.println((Object) this);
            this.f40 = this.f40 + 1;
            return;
        }
    }
}