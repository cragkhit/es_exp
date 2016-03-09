public SLinkedList InsertNext(int value){
    SLinkedList node = new SLinkedList(value);
    if (this.next == null) {
        node.next = null;
        this.next = node;
    } else {
        SLinkedList temp = this.next;
        node.next = temp;
        this.next = node;
    }
    return node;
}