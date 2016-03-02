public static void Solve2DiscsTOH(java.util.Stack a, java.util.Stack a0, java.util.Stack a1){
    a0.push(a.pop());
    movecount = movecount + 1;
    Main.PrintStacks();
    a1.push(a.pop());
    movecount = movecount + 1;
    Main.PrintStacks();
    a1.push(a0.pop());
    movecount = movecount + 1;
    Main.PrintStacks();
}