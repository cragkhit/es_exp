public static void m00(Stack v0, Stack v1, Stack v2){
    v1.push(v0.pop());
    f00 = f00 + 1;
    m20();
    v2.push(v0.pop());
    f00 = f00 + 1;
    m20();
    v2.push(v1.pop());
    f00 = f00 + 1;
    m20();
}