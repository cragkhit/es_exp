public SLinkedList m32(final SLinkedList list){
    SLinkedList list2 = null;
    if (list == null) {
        return list;
    }
    while (true) {
        SLinkedList f12 = list;
        if (f12.f12 == list2) {
            break;
        }
        do {
            final int f2 = f12.f02;
            f12.f02 = f12.f12.f02;
            f12.f12.f02 = f2;
            f12 = f12.f12;
        } while (f12.f12 != list2);
        list2 = f12;
    }
    return list;
}