public static void PrintStacks(){
    int i = countA;
    int i0 = A.size();
    label0: {
        label1: {
            if (i != i0) {
                break label1;
            }
            if (countB != B.size()) {
                break label1;
            }
            if (countC == C.size()) {
                break label0;
            }
        }
        int i1 = A.size() - countA;
        int i2 = B.size() - countB;
        C.size();
        int dummy = countC;
        if (i1 != 1) {
            if (i2 != 1) {
                if (i1 != -1) {
                    System.out.print(new StringBuilder().append("Move Disc ").append(C.peek()).append(" From B To C").toString());
                } else {
                    System.out.print(new StringBuilder().append("Move Disc ").append(C.peek()).append(" From A To C").toString());
                }
            } else if (i1 != -1) {
                System.out.print(new StringBuilder().append("Move Disc ").append(B.peek()).append(" From C To B").toString());
            } else {
                System.out.print(new StringBuilder().append("Move Disc ").append(B.peek()).append(" From A To B").toString());
            }
        } else if (i2 != -1) {
            System.out.print(new StringBuilder().append("Move Disc ").append(A.peek()).append(" From C To A").toString());
        } else {
            System.out.print(new StringBuilder().append("Move Disc ").append(A.peek()).append(" From B To A").toString());
        }
        countA = A.size();
        countB = B.size();
        countC = C.size();
        System.out.println();
    }
    Main.PrintStack(A);
    System.out.print(" , ");
    Main.PrintStack(B);
    System.out.print(" , ");
    Main.PrintStack(C);
    System.out.print(" , ");
}