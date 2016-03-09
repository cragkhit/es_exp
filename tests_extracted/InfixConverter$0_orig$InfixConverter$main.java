public static void main(String[] args){
    String infixBuffer = "";
    String postfixBuffer = "";
    if (args.length == 1) {
        infixBuffer = args[0];
        postfixBuffer = InfixToPostfixConvert(infixBuffer);
        System.out.println("InFix  :\t" + infixBuffer);
        System.out.println("PostFix:\t" + postfixBuffer);
        System.out.println();
    } else {
        infixBuffer = "a+b*c";
        postfixBuffer = InfixToPostfixConvert(infixBuffer);
        System.out.println("InFix  :\t" + infixBuffer);
        System.out.println("PostFix:\t" + postfixBuffer);
        System.out.println();
        infixBuffer = "a+b*c/d-e";
        postfixBuffer = InfixToPostfixConvert(infixBuffer);
        System.out.println("InFix  :\t" + infixBuffer);
        System.out.println("PostFix:\t" + postfixBuffer);
        System.out.println();
        infixBuffer = "a+b*c/d-e+f*h/i+j-k";
        postfixBuffer = InfixToPostfixConvert(infixBuffer);
        System.out.println("InFix  :\t" + infixBuffer);
        System.out.println("PostFix:\t" + postfixBuffer);
        System.out.println();
    }
}