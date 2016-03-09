public static void PrintStacks(){
    if (countA != A.size() || countB != B.size() || countC != C.size()) {
        int diffA = A.size() - countA;
        int diffB = B.size() - countB;
        int diffC = C.size() - countC;
        if (diffA == 1) {
            if (diffB == -1) {
                System.out.print("Move Disc " + A.peek() + " From B To A");
            } else {
                System.out.print("Move Disc " + A.peek() + " From C To A");
            }
        } else if (diffB == 1) {
            if (diffA == -1) {
                System.out.print("Move Disc " + B.peek() + " From A To B");
            } else {
                System.out.print("Move Disc " + B.peek() + " From C To B");
            }
        } else {
            if (diffA == -1) {
                System.out.print("Move Disc " + C.peek() + " From A To C");
            } else {
                System.out.print("Move Disc " + C.peek() + " From B To C");
            }
        }
        countA = A.size();
        countB = B.size();
        countC = C.size();
        System.out.println();
    }
    PrintStack(A);
    System.out.print(" , ");
    PrintStack(B);
    System.out.print(" , ");
    PrintStack(C);
    System.out.print(" , ");
}