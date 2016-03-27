public static void main(String[] v21){
    double v22;
    v22 = 0;
    while (v22 <= 10000) {
        System.out.print("sqrt(");
        System.out.print(v22);
        System.out.print(") = ");
        System.out.print(m00(v22));
        System.out.print(", ");
        System.out.println(Math.sqrt(v22));
        v22 = v22 + (50);
    }
}