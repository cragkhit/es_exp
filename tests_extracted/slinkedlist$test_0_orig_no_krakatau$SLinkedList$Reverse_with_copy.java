public SLinkedList Reverse_with_copy(SLinkedList a){
    SLinkedList a0 = null;
    while (a != null) {
        SLinkedList a1 = new SLinkedList(a.data);
        a1.next = a0;
        a = a.next;
        a0 = a1;
    }
    return a0;
}