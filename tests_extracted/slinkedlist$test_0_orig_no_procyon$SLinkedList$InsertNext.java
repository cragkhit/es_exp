public SLinkedList InsertNext(final int n){
    final SLinkedList list = new SLinkedList(n);
    if (this.next == null) {
        list.next = null;
        this.next = list;
    } else {
        list.next = this.next;
        this.next = list;
    }
    return list;
}