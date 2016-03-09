public static void main(String[] a0){
    SLinkedList a1 = new SLinkedList(1);
    a1.a(2).a(3).a(4).a(5).a(6).a(7).a(8);
    a1.a((SLinkedList) null);
    SLinkedList a2 = null;
    while (a1 != null) {
        SLinkedList a3 = a1.b;
        a1.b = a2;
        a1 = a3;
        a2 = a1;
    }
    a2.a((SLinkedList) null);
}