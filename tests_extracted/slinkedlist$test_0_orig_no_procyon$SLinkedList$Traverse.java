public void Traverse(SLinkedList next){
    if (next == null) {
        next = this;
    }
    System.out.println("\n\nTraversing in Forward Direction\n\n");
    while (next != null) {
        System.out.println(next.data);
        next = next.next;
    }
}