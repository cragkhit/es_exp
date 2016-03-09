public static void PrintStacks(){
    if (Main.countA != Main.A.size() || Main.countB != Main.B.size() || Main.countC != Main.C.size()) {
        final int n = Main.A.size() - Main.countA;
        final int n2 = Main.B.size() - Main.countB;
        final int n3 = Main.C.size() - Main.countC;
        if (n == 1) {
            if (n2 == -1) {
                System.out.print("Move Disc " + Main.A.peek() + " From B To A");
            } else {
                System.out.print("Move Disc " + Main.A.peek() + " From C To A");
            }
        } else if (n2 == 1) {
            if (n == -1) {
                System.out.print("Move Disc " + Main.B.peek() + " From A To B");
            } else {
                System.out.print("Move Disc " + Main.B.peek() + " From C To B");
            }
        } else if (n == -1) {
            System.out.print("Move Disc " + Main.C.peek() + " From A To C");
        } else {
            System.out.print("Move Disc " + Main.C.peek() + " From B To C");
        }
        Main.countA = Main.A.size();
        Main.countB = Main.B.size();
        Main.countC = Main.C.size();
        System.out.println();
    }
    PrintStack(Main.A);
    System.out.print(" , ");
    PrintStack(Main.B);
    System.out.print(" , ");
    PrintStack(Main.C);
    System.out.print(" , ");
}