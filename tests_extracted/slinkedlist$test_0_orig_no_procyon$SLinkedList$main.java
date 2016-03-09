public static void main(final String[] array){
    final SLinkedList list = new SLinkedList(1);
    list.InsertNext(2).InsertNext(3).InsertNext(4).InsertNext(5).InsertNext(6).InsertNext(7).InsertNext(8);
    list.Traverse(null);
    list.Reverse(list).Traverse(null);
}