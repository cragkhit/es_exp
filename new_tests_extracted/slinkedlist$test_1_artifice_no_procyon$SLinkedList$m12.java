public int m12(){
    if (this.f12 == null) {
        return 0;
    }
    final SLinkedList f12 = this.f12;
    this.f12 = this.f12.f12;
    return 1;
}