public SLinkedList m02(int v1){
    SLinkedList v2;
    v2 = new SLinkedList(v1);
    if (this.f12 == null) {
        v2.f12 = null;
        this.f12 = v2;
    } else {
        SLinkedList v3;
        v3 = this.f12;
        v2.f12 = v3;
        this.f12 = v2;
    }
    return v2;
}