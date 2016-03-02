public void Traverse(SLinkedList a){
    if (a == null) {
        a = this;
    }
    System.out.println("\n\nTraversing in Forward Direction\n\n");
    while (a != null) {
        System.out.println(a.data);
        a = a.next;
    }
}