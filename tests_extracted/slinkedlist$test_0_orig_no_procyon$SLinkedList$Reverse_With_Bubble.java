public SLinkedList Reverse_With_Bubble(final SLinkedList list){
    SLinkedList list2 = null;
    if (list == null) {
        return list;
    }
    while (true) {
        SLinkedList next = list;
        if (next.next == list2) {
            break;
        }
        do {
            final int data = next.data;
            next.data = next.next.data;
            next.next.data = data;
            next = next.next;
        } while (next.next != list2);
        list2 = next;
    }
    return list;
}