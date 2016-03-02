public static void main(String[] a){
    double d = 0.0;
    while (d <= 10000.0) {
        System.out.print("sqrt(");
        System.out.print(d);
        System.out.print(") = ");
        System.out.print(SqrtAlgorithm.SqrtByAlogorithm(d));
        System.out.print(", ");
        System.out.println(Math.sqrt(d));
        d = d + 50.0;
    }
}