public static LinkedList m03(LinkedList v0){
    System.out.println("Rearranging Cars...");
    LinkedList v1;
    v1 = new LinkedList();
    LinkedList v2;
    v2 = new LinkedList();
    LinkedList v3;
    v3 = new LinkedList();
    LinkedList v4;
    v4 = new LinkedList();
    v1 = v0;
    for (; true; ) {
        int v5;
        v5 = v1.size();
        if (v5 == 0) {
            break;
        }
        int v6;
        v6 = 0;
        while (v6 < v5) {
            if (v6 == 0) {
                v3.add(v1.element());
                v1.remove();
            } else {
                int v7;
                v7 = Integer.parseInt(v3.element().toString());
                int v8;
                v8 = Integer.parseInt(v1.element().toString());
                if (v7 < v8) {
                    v2.add(v3.element());
                    v3.remove();
                    v3.add(v1.element());
                    v1.remove();
                } else {
                    v2.add(v1.element());
                    v1.remove();
                }
            }
            v6 = v6 + 1;
        }
        int v9;
        v9 = v2.size();
        int v10;
        v10 = 0;
        while (v10 < v9) {
            v1.add(v2.element());
            v2.remove();
            v10 = v10 + 1;
        }
        v4.add(v3.element());
        v3.remove();
        System.out.print(v1.toString());
        System.out.print(" , ");
        System.out.print(v2.toString());
        System.out.print(" , ");
        System.out.print(v3.toString());
        System.out.print(" , ");
        System.out.println(v4.toString());
    }
    return v4;
}