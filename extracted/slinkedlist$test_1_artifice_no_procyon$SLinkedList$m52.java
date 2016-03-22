public SLinkedList m52(final SLinkedList list){
    SLinkedList f12 = list;
    SLinkedList f2 = null;
    while (f12 != null) {
        final SLinkedList list2 = new SLinkedList(f12.f02);
        list2.f12 = f2;
        f2 = list2;
        f12 = f12.f12;
    }
    return f2;
}