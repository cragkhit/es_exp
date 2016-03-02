public SLinkedList InsertNext(int i){
    SLinkedList a = new SLinkedList(i);
    if (this.next != null) {
        a.next = this.next;
        this.next = a;
    } else {
        a.next = null;
        this.next = a;
    }
    return a;
}