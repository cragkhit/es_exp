private static int a(){
    int i = 0;
    try {
        i = Integer.parseInt(new java.io.BufferedReader((java.io.Reader) new java.io.InputStreamReader(System.in)).readLine());
    } catch (Exception a) {
        a.printStackTrace();
        return 0;
    }
    return i;
}