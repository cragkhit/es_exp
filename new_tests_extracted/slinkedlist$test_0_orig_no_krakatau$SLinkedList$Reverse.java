public SLinkedList Reverse(SLinkedList a){
    if (a == null) {
        SLinkedList a0 = null;
        return a0;
    }
    SLinkedList a1 = null;
    while (a != null) {
        SLinkedList a2 = a.next;
        a.next = a1;
        a = a2;
        a1 = a;
    }
    return a1;
}