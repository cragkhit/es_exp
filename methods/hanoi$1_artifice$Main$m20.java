public static void m20(){
    if (f40 != f10.size() || f50 != f20.size() || f60 != f30.size()) {
        int v7;
        v7 = f10.size() - f40;
        int v8;
        v8 = f20.size() - f50;
        int v9;
        v9 = f30.size() - f60;
        if (v7 == 1) {
            if (v8 == -1) {
                System.out.print("Move Disc " + f10.peek() + " From B To A");
            } else {
                System.out.print("Move Disc " + f10.peek() + " From C To A");
            }
        } else if (v8 == 1) {
            if (v7 == -1) {
                System.out.print("Move Disc " + f20.peek() + " From A To B");
            } else {
                System.out.print("Move Disc " + f20.peek() + " From C To B");
            }
        } else {
            if (v7 == -1) {
                System.out.print("Move Disc " + f30.peek() + " From A To C");
            } else {
                System.out.print("Move Disc " + f30.peek() + " From B To C");
            }
        }
        f40 = f10.size();
        f50 = f20.size();
        f60 = f30.size();
        System.out.println();
    }
    m30(f10);
    System.out.print(" , ");
    m30(f20);
    System.out.print(" , ");
    m30(f30);
    System.out.print(" , ");
}