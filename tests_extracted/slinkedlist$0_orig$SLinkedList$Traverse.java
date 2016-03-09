public void Traverse(SLinkedList node){
    if (node == null) {
        node = this;
    }
    System.out.println("\n\nTraversing in Forward Direction\n\n");
    while (node != null) {
        System.out.println(node.data);
        node = node.next;
    }
}