private void a(SLinkedList a0){
    System.out.println("\n\nTraversing in Forward Direction\n\n");
    SLinkedList a1 = this;
    while (a1 != null) {
        System.out.println(a1.a);
        a1 = a1.b;
    }
}