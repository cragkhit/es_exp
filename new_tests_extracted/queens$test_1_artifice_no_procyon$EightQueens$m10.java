public void m10(final int n){
    if (n == this.f00.length) {
        this.m30();
        ++this.f20;
    }
    for (int i = 0; i < this.f00.length; ++i) {
        if (!this.f10[i] && !this.m20(n, i)) {
            this.f00[n] = i;
            this.f10[i] = true;
            this.m10(n + 1);
            this.f10[i] = false;
        }
    }
}