public static int m10(int n, final Stack stack, final Stack stack2, final Stack stack3){
    if (n <= 4) {
        if (n % 2 == 0) {
            m00(stack, stack2, stack3);
            --n;
            if (n == 1) {
                return 1;
            }
            stack2.push(stack.pop());
            ++Main.f00;
            m20();
            m00(stack3, stack, stack2);
            stack3.push(stack.pop());
            ++Main.f00;
            m20();
            m10(n, stack2, stack, stack3);
        } else {
            if (n == 1) {
                return -1;
            }
            m00(stack, stack3, stack2);
            --n;
            stack3.push(stack.pop());
            ++Main.f00;
            m20();
            m00(stack2, stack, stack3);
        }
        return 1;
    }
    if (n >= 5) {
        m10(n - 2, stack, stack2, stack3);
        stack2.push(stack.pop());
        ++Main.f00;
        m20();
        m10(n - 2, stack3, stack, stack2);
        stack3.push(stack.pop());
        ++Main.f00;
        m20();
        m10(n - 1, stack2, stack, stack3);
    }
    return 1;
}