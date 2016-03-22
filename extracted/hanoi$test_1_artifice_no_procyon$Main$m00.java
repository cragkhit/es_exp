public static void m00(final Stack stack, final Stack stack2, final Stack stack3){
    stack2.push(stack.pop());
    ++Main.f00;
    m20();
    stack3.push(stack.pop());
    ++Main.f00;
    m20();
    stack3.push(stack2.pop());
    ++Main.f00;
    m20();
}