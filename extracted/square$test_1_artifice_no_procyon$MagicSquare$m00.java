public void m00(final int n, final int n2){
    if (!this.m10() || !this.m20() || !this.m30()) {
        return;
    }
    if (n == this.f00.length) {
        System.out.println(this);
        ++this.f40;
        return;
    }
    for (int i = 0; i < this.f20; ++i) {
        if (this.f10[i]) {
            this.f00[n][n2] = i + 1;
            this.f10[i] = false;
            int n3 = n2 + 1;
            int n4 = n;
            if (n3 == this.f00.length) {
                ++n4;
                n3 = 0;
            }
            this.m00(n4, n3);
            this.f00[n][n2] = 0;
            this.f10[i] = true;
        }
    }
}