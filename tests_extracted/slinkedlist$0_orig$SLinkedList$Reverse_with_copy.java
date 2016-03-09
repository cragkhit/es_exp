public SLinkedList Reverse_with_copy(SLinkedList head){
    SLinkedList p = head;
    SLinkedList newhead = null;
    while (true) {
        if (p == null) {
            return newhead;
        }
        SLinkedList newnode = new SLinkedList(p.data);
        newnode.next = newhead;
        newhead = newnode;
        p = p.next;
    }
}