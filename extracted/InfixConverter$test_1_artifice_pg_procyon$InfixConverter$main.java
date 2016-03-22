public static void main(final String[] array){
    if (array.length == 1) {
        final String s;
        final String a = a(s = array[0]);
        System.out.println("InFix  :\t" + s);
        System.out.println("PostFix:\t" + a);
        System.out.println();
        return;
    }
    final String s2;
    final String a2 = a(s2 = "a+b*c");
    System.out.println("InFix  :\t" + s2);
    System.out.println("PostFix:\t" + a2);
    System.out.println();
    final String s3;
    final String a3 = a(s3 = "a+b*c/d-e");
    System.out.println("InFix  :\t" + s3);
    System.out.println("PostFix:\t" + a3);
    System.out.println();
    final String s4;
    final String a4 = a(s4 = "a+b*c/d-e+f*h/i+j-k");
    System.out.println("InFix  :\t" + s4);
    System.out.println("PostFix:\t" + a4);
    System.out.println();
}