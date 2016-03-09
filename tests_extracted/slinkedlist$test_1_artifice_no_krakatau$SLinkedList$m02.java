public SLinkedList m02(int i){
    SLinkedList a = new SLinkedList(i);
    if (this.f12 != null) {
        a.f12 = this.f12;
        this.f12 = a;
    } else {
        a.f12 = null;
        this.f12 = a;
    }
    return a;
}