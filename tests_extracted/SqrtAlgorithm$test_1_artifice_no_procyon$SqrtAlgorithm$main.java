public static void main(final String[] array){
    for (double n = 0.0; n <= 10000.0; n += 50.0) {
        System.out.print("sqrt(");
        System.out.print(n);
        System.out.print(") = ");
        System.out.print(m00(n));
        System.out.print(", ");
        System.out.println(Math.sqrt(n));
    }
}