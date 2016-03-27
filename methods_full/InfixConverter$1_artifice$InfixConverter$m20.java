public static String m20(String v6){
    int v7;
    v7 = 0;
    String v8;
    v8 = "";
    Stack v9;
    v9 = new Stack();
    int v10;
    v10 = 0;
    while (v10 < v6.length()) {
        char v11;
        v11 = v6.charAt(v10);
        if (v11 == '+' || v11 == '-' || v11 == '*' || v11 == '/') {
            if (v9.size() <= 0) {
                v9.push(v11);
            } else {
                Character v12;
                v12 = (Character) v9.peek();
                if (v12 == '*' || v12 == '/') {
                    v7 = 1;
                } else {
                    v7 = 0;
                }
                if (v7 == 1) {
                    if (v11 == '+' || v11 == '-') {
                        v8 = v8 + (v9.pop());
                        v10 = v10 - 1;
                    } else {
                        v8 = v8 + (v9.pop());
                        v10 = v10 - 1;
                    }
                } else {
                    if (v11 == '+' || v11 == '-') {
                        v8 = v8 + (v9.pop());
                        v9.push(v11);
                    } else {
                        v9.push(v11);
                    }
                }
            }
        } else {
            v8 = v8 + (v11);
        }
        v10 = v10 + 1;
    }
    int v13;
    v13 = v9.size();
    int v14;
    v14 = 0;
    while (v14 < v13) {
        v8 = v8 + (v9.pop());
        v14 = v14 + 1;
    }
    return v8;
}