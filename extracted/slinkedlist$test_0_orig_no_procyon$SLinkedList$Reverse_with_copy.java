public SLinkedList Reverse_with_copy(final SLinkedList list){
    SLinkedList next = list;
    SLinkedList next2 = null;
    while (next != null) {
        final SLinkedList list2 = new SLinkedList(next.data);
        list2.next = next2;
        next2 = list2;
        next = next.next;
    }
    return next2;
}