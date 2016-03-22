public static void Solve2DiscsTOH(final Stack stack, final Stack stack2, final Stack stack3){
    stack2.push(stack.pop());
    ++Main.movecount;
    PrintStacks();
    stack3.push(stack.pop());
    ++Main.movecount;
    PrintStacks();
    stack3.push(stack2.pop());
    ++Main.movecount;
    PrintStacks();
}