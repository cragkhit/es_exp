public static void main(String[] v15){
    String v16;
    v16 = "";
    String v17;
    v17 = "";
    if (v15.length == 1) {
        v16 = v15[0];
        v17 = m20(v16);
        System.out.println("InFix  :\t" + v16);
        System.out.println("PostFix:\t" + v17);
        System.out.println();
    } else {
        v16 = "a+b*c";
        v17 = m20(v16);
        System.out.println("InFix  :\t" + v16);
        System.out.println("PostFix:\t" + v17);
        System.out.println();
        v16 = "a+b*c/d-e";
        v17 = m20(v16);
        System.out.println("InFix  :\t" + v16);
        System.out.println("PostFix:\t" + v17);
        System.out.println();
        v16 = "a+b*c/d-e+f*h/i+j-k";
        v17 = m20(v16);
        System.out.println("InFix  :\t" + v16);
        System.out.println("PostFix:\t" + v17);
        System.out.println();
    }
}