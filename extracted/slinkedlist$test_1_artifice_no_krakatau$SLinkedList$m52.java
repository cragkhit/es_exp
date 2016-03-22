public SLinkedList m52(SLinkedList a){
    SLinkedList a0 = null;
    while (a != null) {
        SLinkedList a1 = new SLinkedList(a.f02);
        a1.f12 = a0;
        a = a.f12;
        a0 = a1;
    }
    return a0;
}