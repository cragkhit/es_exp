public static void main(final String[] array){
    if (array.length == 1) {
        final String s = array[0];
        final String m20 = m20(s);
        System.out.println("InFix  :\t" + s);
        System.out.println("PostFix:\t" + m20);
        System.out.println();
    } else {
        final String s2 = "a+b*c";
        final String m2 = m20(s2);
        System.out.println("InFix  :\t" + s2);
        System.out.println("PostFix:\t" + m2);
        System.out.println();
        final String s3 = "a+b*c/d-e";
        final String m3 = m20(s3);
        System.out.println("InFix  :\t" + s3);
        System.out.println("PostFix:\t" + m3);
        System.out.println();
        final String s4 = "a+b*c/d-e+f*h/i+j-k";
        final String m4 = m20(s4);
        System.out.println("InFix  :\t" + s4);
        System.out.println("PostFix:\t" + m4);
        System.out.println();
    }
}