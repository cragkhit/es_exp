public SLinkedList Reverse(SLinkedList list){
    if (list == null) {
        return list;
    }
    SLinkedList list2 = list;
    SLinkedList next = null;
    while (list2 != null) {
        final SLinkedList next2 = list2.next;
        list2.next = next;
        next = list2;
        list2 = next2;
    }
    list = next;
    return list;
}