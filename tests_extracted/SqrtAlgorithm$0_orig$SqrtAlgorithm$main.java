public static void main(String[] args){
    for (double d = 0; d <= 10000; d += 50) {
        System.out.print("sqrt(");
        System.out.print(d);
        System.out.print(") = ");
        System.out.print(SqrtByAlogorithm(d));
        System.out.print(", ");
        System.out.println(Math.sqrt(d));
    }
}