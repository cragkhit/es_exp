public static int m10(int v3, Stack v4, Stack v5, Stack v6){
    if (v3 <= 4) {
        if ((v3 % 2) == 0) {
            m00(v4, v5, v6);
            v3 = v3 - 1;
            if (v3 == 1) {
                return 1;
            }
            v5.push(v4.pop());
            f00 = f00 + 1;
            m20();
            m00(v6, v4, v5);
            v6.push(v4.pop());
            f00 = f00 + 1;
            m20();
            m10(v3, v5, v4, v6);
        } else {
            if (v3 == 1) {
                return -1;
            }
            m00(v4, v6, v5);
            v3 = v3 - 1;
            v6.push(v4.pop());
            f00 = f00 + 1;
            m20();
            m00(v5, v4, v6);
        }
        return 1;
    } else if (v3 >= 5) {
        m10(v3 - 2, v4, v5, v6);
        v5.push(v4.pop());
        f00 = f00 + 1;
        m20();
        m10(v3 - 2, v6, v4, v5);
        v6.push(v4.pop());
        f00 = f00 + 1;
        m20();
        m10(v3 - 1, v5, v4, v6);
    }
    return 1;
}