public static void main(String[] args){
    SLinkedList head = new SLinkedList(1);
    SLinkedList p = head.InsertNext(2);
    p = p.InsertNext(3);
    p = p.InsertNext(4);
    p = p.InsertNext(5);
    p = p.InsertNext(6);
    p = p.InsertNext(7);
    p = p.InsertNext(8);
    head.Traverse(null);
    SLinkedList newhead = head.Reverse(head);
    newhead.Traverse(null);
}