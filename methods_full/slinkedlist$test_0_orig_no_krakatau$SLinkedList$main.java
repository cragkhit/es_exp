public static void main(String[] a){
    SLinkedList a0 = new SLinkedList(1);
    a0.InsertNext(2).InsertNext(3).InsertNext(4).InsertNext(5).InsertNext(6).InsertNext(7).InsertNext(8);
    a0.Traverse((SLinkedList) null);
    a0.Reverse(a0).Traverse((SLinkedList) null);
}