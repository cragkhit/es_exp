public SLinkedList Reverse_With_Bubble(SLinkedList head){
    SLinkedList testnode = null;
    if (head == null) {
        return head;
    }
    while (true) {
        SLinkedList p = head;
        if (p.next == testnode) {
            break;
        }
        while (true) {
            int temp = p.data;
            p.data = p.next.data;
            p.next.data = temp;
            p = p.next;
            if (p.next == testnode) {
                testnode = p;
                break;
            }
        }
    }
    return head;
}