public int DeleteNext(){
    if (this.next == null) {
        return 0;
    }
    final SLinkedList next = this.next;
    this.next = this.next.next;
    return 1;
}