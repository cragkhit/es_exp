public static void m20(){
    int i = f40;
    int i0 = f10.size();
    label0: {
        label1: {
            if (i != i0) {
                break label1;
            }
            if (f50 != f20.size()) {
                break label1;
            }
            if (f60 == f30.size()) {
                break label0;
            }
        }
        int i1 = f10.size() - f40;
        int i2 = f20.size() - f50;
        f30.size();
        int dummy = f60;
        if (i1 != 1) {
            if (i2 != 1) {
                if (i1 != -1) {
                    System.out.print(new StringBuilder().append("Move Disc ").append(f30.peek()).append(" From B To C").toString());
                } else {
                    System.out.print(new StringBuilder().append("Move Disc ").append(f30.peek()).append(" From A To C").toString());
                }
            } else if (i1 != -1) {
                System.out.print(new StringBuilder().append("Move Disc ").append(f20.peek()).append(" From C To B").toString());
            } else {
                System.out.print(new StringBuilder().append("Move Disc ").append(f20.peek()).append(" From A To B").toString());
            }
        } else if (i2 != -1) {
            System.out.print(new StringBuilder().append("Move Disc ").append(f10.peek()).append(" From C To A").toString());
        } else {
            System.out.print(new StringBuilder().append("Move Disc ").append(f10.peek()).append(" From B To A").toString());
        }
        f40 = f10.size();
        f50 = f20.size();
        f60 = f30.size();
        System.out.println();
    }
    Main.m30(f10);
    System.out.print(" , ");
    Main.m30(f20);
    System.out.print(" , ");
    Main.m30(f30);
    System.out.print(" , ");
}