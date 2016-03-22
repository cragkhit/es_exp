public SLinkedList m32(SLinkedList a){
    SLinkedList a0 = null;
    if (a == null) {
        SLinkedList a1 = null;
        return a1;
    }
    while (a.f12 != a0) {
        SLinkedList a2 = a;
        while (true) {
            int i = a2.f02;
            a2.f02 = a2.f12.f02;
            a2.f12.f02 = i;
            a2 = a2.f12;
            if (a2.f12 == a0) {
                a0 = a2;
                break;
            }
        }
    }
    return a;
}