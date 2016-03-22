public SLinkedList Reverse(SLinkedList head){
    if (head == null) {
        return head;
    }
    SLinkedList cp = head;
    SLinkedList prev = null;
    while (cp != null) {
        SLinkedList next = cp.next;
        cp.next = prev;
        prev = cp;
        cp = next;
    }
    head = prev;
    return head;
}