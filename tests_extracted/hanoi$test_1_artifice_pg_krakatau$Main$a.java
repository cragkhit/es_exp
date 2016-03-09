private static void a(){
    int i = e;
    int i0 = b.size();
    label0: {
        label1: {
            if (i != i0) {
                break label1;
            }
            if (f != c.size()) {
                break label1;
            }
            if (g == d.size()) {
                break label0;
            }
        }
        int i1 = b.size() - e;
        int i2 = c.size() - f;
        d.size();
        int dummy = g;
        if (i1 != 1) {
            if (i2 != 1) {
                if (i1 != -1) {
                    System.out.print(new StringBuilder("Move Disc ").append(d.peek()).append(" From B To C").toString());
                } else {
                    System.out.print(new StringBuilder("Move Disc ").append(d.peek()).append(" From A To C").toString());
                }
            } else if (i1 != -1) {
                System.out.print(new StringBuilder("Move Disc ").append(c.peek()).append(" From C To B").toString());
            } else {
                System.out.print(new StringBuilder("Move Disc ").append(c.peek()).append(" From A To B").toString());
            }
        } else if (i2 != -1) {
            System.out.print(new StringBuilder("Move Disc ").append(b.peek()).append(" From C To A").toString());
        } else {
            System.out.print(new StringBuilder("Move Disc ").append(b.peek()).append(" From B To A").toString());
        }
        e = b.size();
        f = c.size();
        g = d.size();
        System.out.println();
    }
    Main.a(b);
    System.out.print(" , ");
    Main.a(c);
    System.out.print(" , ");
    Main.a(d);
    System.out.print(" , ");
}