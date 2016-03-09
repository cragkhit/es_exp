public void m22(SLinkedList f12){
    if (f12 == null) {
        f12 = this;
    }
    System.out.println("\n\nTraversing in Forward Direction\n\n");
    while (f12 != null) {
        System.out.println(f12.f02);
        f12 = f12.f12;
    }
}