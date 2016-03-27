private static void a(){
    if (Main.e != Main.b.size() || Main.f != Main.c.size() || Main.g != Main.d.size()) {
        final int n = Main.b.size() - Main.e;
        final int n2 = Main.c.size() - Main.f;
        Main.d.size();
        final int g = Main.g;
        if (n == 1) {
            if (n2 == -1) {
                System.out.print("Move Disc " + Main.b.peek() + " From B To A");
            } else {
                System.out.print("Move Disc " + Main.b.peek() + " From C To A");
            }
        } else if (n2 == 1) {
            if (n == -1) {
                System.out.print("Move Disc " + Main.c.peek() + " From A To B");
            } else {
                System.out.print("Move Disc " + Main.c.peek() + " From C To B");
            }
        } else if (n == -1) {
            System.out.print("Move Disc " + Main.d.peek() + " From A To C");
        } else {
            System.out.print("Move Disc " + Main.d.peek() + " From B To C");
        }
        Main.e = Main.b.size();
        Main.f = Main.c.size();
        Main.g = Main.d.size();
        System.out.println();
    }
    a(Main.b);
    System.out.print(" , ");
    a(Main.c);
    System.out.print(" , ");
    a(Main.d);
    System.out.print(" , ");
}