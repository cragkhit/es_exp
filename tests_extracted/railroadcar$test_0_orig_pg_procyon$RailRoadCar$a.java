private static LinkedList a(LinkedList list){
    System.out.println("Rearranging Cars...");
    new LinkedList();
    final LinkedList<Object> list2 = new LinkedList<Object>();
    final LinkedList<Object> list3 = new LinkedList<Object>();
    final LinkedList<Object> list4 = new LinkedList<Object>();
    list = list;
    int size;
    while ((size = list.size()) != 0) {
        for (int i = 0; i < size; ++i) {
            if (i == 0) {
                list3.add(list.element());
                list.remove();
            } else if (Integer.parseInt(list3.element().toString()) < Integer.parseInt(list.element().toString())) {
                list2.add(list3.element());
                list3.remove();
                list3.add(list.element());
                list.remove();
            } else {
                list2.add(list.element());
                list.remove();
            }
        }
        for (int size2 = list2.size(), j = 0; j < size2; ++j) {
            list.add(list2.element());
            list2.remove();
        }
        list4.add(list3.element());
        list3.remove();
        System.out.print(list.toString());
        System.out.print(" , ");
        System.out.print(list2.toString());
        System.out.print(" , ");
        System.out.print(list3.toString());
        System.out.print(" , ");
        System.out.println(list4.toString());
    }
    return list4;
}