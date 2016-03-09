public static int SolveTOH(int i, java.util.Stack a, java.util.Stack a0, java.util.Stack a1){
    if (i > 4) {
        Main.SolveTOH(i - 2, a, a0, a1);
        a0.push(a.pop());
        movecount = movecount + 1;
        Main.PrintStacks();
        Main.SolveTOH(i - 2, a1, a, a0);
        a1.push(a.pop());
        movecount = movecount + 1;
        Main.PrintStacks();
        Main.SolveTOH(i - 1, a0, a, a1);
        return 1;
    } else {
        if (i % 2 != 0) {
            if (i == 1) {
                return -1;
            }
            Main.Solve2DiscsTOH(a, a1, a0);
            a1.push(a.pop());
            movecount = movecount + 1;
            Main.PrintStacks();
            Main.Solve2DiscsTOH(a0, a, a1);
        } else {
            Main.Solve2DiscsTOH(a, a0, a1);
            int i0 = i - 1;
            if (i0 == 1) {
                return 1;
            }
            a0.push(a.pop());
            movecount = movecount + 1;
            Main.PrintStacks();
            Main.Solve2DiscsTOH(a1, a, a0);
            a1.push(a.pop());
            movecount = movecount + 1;
            Main.PrintStacks();
            Main.SolveTOH(i0, a0, a, a1);
        }
        return 1;
    }
}