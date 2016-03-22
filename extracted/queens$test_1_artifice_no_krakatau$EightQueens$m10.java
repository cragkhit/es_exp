public void m10(int i){
    if (i == this.f00.length) {
        this.m30();
        this.f20 = this.f20 + 1;
    }
    int i0 = 0;
    while (i0 < this.f00.length) {
        if (!this.f10[i0] && !this.m20(i, i0)) {
            this.f00[i] = i0;
            this.f10[i0] = true;
            this.m10(i + 1);
            this.f10[i0] = false;
        }
        i0 = i0 + 1;
    }
}