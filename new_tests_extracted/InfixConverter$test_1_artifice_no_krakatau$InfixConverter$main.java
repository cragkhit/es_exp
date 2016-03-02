public static void main(String[] a){
    if (a.length != 1) {
        String s = InfixConverter.m20("a+b*c");
        System.out.println(new StringBuilder().append("InFix  :\t").append("a+b*c").toString());
        System.out.println(new StringBuilder().append("PostFix:\t").append(s).toString());
        System.out.println();
        String s0 = InfixConverter.m20("a+b*c/d-e");
        System.out.println(new StringBuilder().append("InFix  :\t").append("a+b*c/d-e").toString());
        System.out.println(new StringBuilder().append("PostFix:\t").append(s0).toString());
        System.out.println();
        String s1 = InfixConverter.m20("a+b*c/d-e+f*h/i+j-k");
        System.out.println(new StringBuilder().append("InFix  :\t").append("a+b*c/d-e+f*h/i+j-k").toString());
        System.out.println(new StringBuilder().append("PostFix:\t").append(s1).toString());
        System.out.println();
    } else {
        String s2 = a[0];
        String s3 = InfixConverter.m20(s2);
        System.out.println(new StringBuilder().append("InFix  :\t").append(s2).toString());
        System.out.println(new StringBuilder().append("PostFix:\t").append(s3).toString());
        System.out.println();
    }
}