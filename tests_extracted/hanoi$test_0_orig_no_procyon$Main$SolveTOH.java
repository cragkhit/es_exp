public static int SolveTOH(int n, final Stack stack, final Stack stack2, final Stack stack3){
    if (n <= 4) {
        if (n % 2 == 0) {
            Solve2DiscsTOH(stack, stack2, stack3);
            --n;
            if (n == 1) {
                return 1;
            }
            stack2.push(stack.pop());
            ++Main.movecount;
            PrintStacks();
            Solve2DiscsTOH(stack3, stack, stack2);
            stack3.push(stack.pop());
            ++Main.movecount;
            PrintStacks();
            SolveTOH(n, stack2, stack, stack3);
        } else {
            if (n == 1) {
                return -1;
            }
            Solve2DiscsTOH(stack, stack3, stack2);
            --n;
            stack3.push(stack.pop());
            ++Main.movecount;
            PrintStacks();
            Solve2DiscsTOH(stack2, stack, stack3);
        }
        return 1;
    }
    if (n >= 5) {
        SolveTOH(n - 2, stack, stack2, stack3);
        stack2.push(stack.pop());
        ++Main.movecount;
        PrintStacks();
        SolveTOH(n - 2, stack3, stack, stack2);
        stack3.push(stack.pop());
        ++Main.movecount;
        PrintStacks();
        SolveTOH(n - 1, stack2, stack, stack3);
    }
    return 1;
}