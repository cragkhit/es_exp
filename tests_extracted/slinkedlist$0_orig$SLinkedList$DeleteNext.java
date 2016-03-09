public int DeleteNext(){
    if (next == null) {
        return 0;
    }
    SLinkedList node = this.next;
    this.next = this.next.next;
    node = null;
    return 1;
}