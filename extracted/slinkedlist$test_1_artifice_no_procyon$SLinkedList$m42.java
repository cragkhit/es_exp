public SLinkedList m42(SLinkedList list){
    if (list == null) {
        return list;
    }
    SLinkedList list2 = list;
    SLinkedList f12 = null;
    while (list2 != null) {
        final SLinkedList f2 = list2.f12;
        list2.f12 = f12;
        f12 = list2;
        list2 = f2;
    }
    list = f12;
    return list;
}