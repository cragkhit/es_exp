public static void main(final String[] array){
    if (array.length == 1) {
        final String s = array[0];
        final String infixToPostfixConvert = InfixToPostfixConvert(s);
        System.out.println("InFix  :\t" + s);
        System.out.println("PostFix:\t" + infixToPostfixConvert);
        System.out.println();
    } else {
        final String s2 = "a+b*c";
        final String infixToPostfixConvert2 = InfixToPostfixConvert(s2);
        System.out.println("InFix  :\t" + s2);
        System.out.println("PostFix:\t" + infixToPostfixConvert2);
        System.out.println();
        final String s3 = "a+b*c/d-e";
        final String infixToPostfixConvert3 = InfixToPostfixConvert(s3);
        System.out.println("InFix  :\t" + s3);
        System.out.println("PostFix:\t" + infixToPostfixConvert3);
        System.out.println();
        final String s4 = "a+b*c/d-e+f*h/i+j-k";
        final String infixToPostfixConvert4 = InfixToPostfixConvert(s4);
        System.out.println("InFix  :\t" + s4);
        System.out.println("PostFix:\t" + infixToPostfixConvert4);
        System.out.println();
    }
}