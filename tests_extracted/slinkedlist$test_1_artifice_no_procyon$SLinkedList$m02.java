public SLinkedList m02(final int n){
    final SLinkedList list = new SLinkedList(n);
    if (this.f12 == null) {
        list.f12 = null;
        this.f12 = list;
    } else {
        list.f12 = this.f12;
        this.f12 = list;
    }
    return list;
}