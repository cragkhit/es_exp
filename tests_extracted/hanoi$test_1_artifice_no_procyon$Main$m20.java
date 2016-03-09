public static void m20(){
    if (Main.f40 != Main.f10.size() || Main.f50 != Main.f20.size() || Main.f60 != Main.f30.size()) {
        final int n = Main.f10.size() - Main.f40;
        final int n2 = Main.f20.size() - Main.f50;
        final int n3 = Main.f30.size() - Main.f60;
        if (n == 1) {
            if (n2 == -1) {
                System.out.print("Move Disc " + Main.f10.peek() + " From B To A");
            } else {
                System.out.print("Move Disc " + Main.f10.peek() + " From C To A");
            }
        } else if (n2 == 1) {
            if (n == -1) {
                System.out.print("Move Disc " + Main.f20.peek() + " From A To B");
            } else {
                System.out.print("Move Disc " + Main.f20.peek() + " From C To B");
            }
        } else if (n == -1) {
            System.out.print("Move Disc " + Main.f30.peek() + " From A To C");
        } else {
            System.out.print("Move Disc " + Main.f30.peek() + " From B To C");
        }
        Main.f40 = Main.f10.size();
        Main.f50 = Main.f20.size();
        Main.f60 = Main.f30.size();
        System.out.println();
    }
    m30(Main.f10);
    System.out.print(" , ");
    m30(Main.f20);
    System.out.print(" , ");
    m30(Main.f30);
    System.out.print(" , ");
}