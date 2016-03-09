public SLinkedList Reverse_With_Bubble(SLinkedList a){
    SLinkedList a0 = null;
    if (a == null) {
        SLinkedList a1 = null;
        return a1;
    }
    while (a.next != a0) {
        SLinkedList a2 = a;
        while (true) {
            int i = a2.data;
            a2.data = a2.next.data;
            a2.next.data = i;
            a2 = a2.next;
            if (a2.next == a0) {
                a0 = a2;
                break;
            }
        }
    }
    return a;
}