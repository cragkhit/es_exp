private static String a(final String s){
    String s2 = "";
    final Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < s.length(); ++i) {
        final char char1;
        if ((char1 = s.charAt(i)) == '+' || char1 == '-' || char1 == '*' || char1 == '/') {
            if (stack.size() <= 0) {
                stack.push(char1);
            } else {
                final Character c;
                if ((c = stack.peek()) == '*' || c == '/') {
                    if (char1 == '+' || char1 == '-') {
                        s2 += stack.pop();
                        --i;
                    } else {
                        s2 += stack.pop();
                        --i;
                    }
                } else if (char1 == '+' || char1 == '-') {
                    s2 += stack.pop();
                    stack.push(char1);
                } else {
                    stack.push(char1);
                }
            }
        } else {
            s2 += char1;
        }
    }
    for (int size = stack.size(), j = 0; j < size; ++j) {
        s2 += stack.pop();
    }
    return s2;
}