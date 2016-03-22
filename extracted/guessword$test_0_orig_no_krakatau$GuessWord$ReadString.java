public static String ReadString(){
    String s = null;
    try {
        s = new java.io.BufferedReader((java.io.Reader) new java.io.InputStreamReader(System.in)).readLine();
    } catch (Exception a) {
        a.printStackTrace();
        return "";
    }
    return s;
}