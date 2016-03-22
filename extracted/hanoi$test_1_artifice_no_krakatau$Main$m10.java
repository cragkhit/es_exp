public static int m10(int i, java.util.Stack a, java.util.Stack a0, java.util.Stack a1){
    if (i > 4) {
        Main.m10(i - 2, a, a0, a1);
        a0.push(a.pop());
        f00 = f00 + 1;
        Main.m20();
        Main.m10(i - 2, a1, a, a0);
        a1.push(a.pop());
        f00 = f00 + 1;
        Main.m20();
        Main.m10(i - 1, a0, a, a1);
        return 1;
    } else {
        if (i % 2 != 0) {
            if (i == 1) {
                return -1;
            }
            Main.m00(a, a1, a0);
            a1.push(a.pop());
            f00 = f00 + 1;
            Main.m20();
            Main.m00(a0, a, a1);
        } else {
            Main.m00(a, a0, a1);
            int i0 = i - 1;
            if (i0 == 1) {
                return 1;
            }
            a0.push(a.pop());
            f00 = f00 + 1;
            Main.m20();
            Main.m00(a1, a, a0);
            a1.push(a.pop());
            f00 = f00 + 1;
            Main.m20();
            Main.m10(i0, a0, a, a1);
        }
        return 1;
    }
}