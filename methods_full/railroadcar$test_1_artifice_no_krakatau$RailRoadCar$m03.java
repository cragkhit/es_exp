public static java.util.LinkedList m03(java.util.LinkedList a){
    System.out.println("Rearranging Cars...");
    java.util.LinkedList a0 = new java.util.LinkedList();
    java.util.LinkedList a1 = new java.util.LinkedList();
    java.util.LinkedList a2 = new java.util.LinkedList();
    java.util.LinkedList a3 = new java.util.LinkedList();
    while (true) {
        int i = a.size();
        if (i == 0) {
            return a3;
        }
        int i0 = 0;
        while (i0 < i) {
            if (i0 != 0) {
                if (Integer.parseInt(a2.element().toString()) >= Integer.parseInt(a.element().toString())) {
                    a1.add(a.element());
                    a.remove();
                } else {
                    a1.add(a2.element());
                    a2.remove();
                    a2.add(a.element());
                    a.remove();
                }
            } else {
                a2.add(a.element());
                a.remove();
                i0 = 0;
            }
            i0 = i0 + 1;
        }
        int i1 = a1.size();
        int i2 = 0;
        while (i2 < i1) {
            a.add(a1.element());
            a1.remove();
            i2 = i2 + 1;
        }
        a3.add(a2.element());
        a2.remove();
        System.out.print(a.toString());
        System.out.print(" , ");
        System.out.print(a1.toString());
        System.out.print(" , ");
        System.out.print(a2.toString());
        System.out.print(" , ");
        System.out.println(a3.toString());
    }
}