public int m12(){
    if (f12 == null) {
        return 0;
    }
    SLinkedList v4;
    v4 = this.f12;
    this.f12 = this.f12.f12;
    v4 = null;
    return 1;
}