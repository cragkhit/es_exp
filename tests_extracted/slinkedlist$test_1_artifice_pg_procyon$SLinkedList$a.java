private void a(SLinkedList b){
    b = this;
    System.out.println("\n\nTraversing in Forward Direction\n\n");
    while (b != null) {
        System.out.println(b.a);
        b = b.b;
    }
}