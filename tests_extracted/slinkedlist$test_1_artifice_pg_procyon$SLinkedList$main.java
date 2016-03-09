public static void main(final String[] array){
    final SLinkedList list;
    (list = new SLinkedList(1)).a(2).a(3).a(4).a(5).a(6).a(7).a(8);
    list.a(null);
    SLinkedList list2 = list;
    SLinkedList b = null;
    while (list2 != null) {
        final SLinkedList b2 = list2.b;
        list2.b = b;
        b = list2;
        list2 = b2;
    }
    b.a(null);
}