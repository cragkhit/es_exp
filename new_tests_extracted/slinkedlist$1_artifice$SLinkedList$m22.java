public void m22(SLinkedList v5){
    if (v5 == null) {
        v5 = this;
    }
    System.out.println("\n\nTraversing in Forward Direction\n\n");
    for (; v5 != null; ) {
        System.out.println(v5.f02);
        v5 = v5.f12;
    }
}