public static int ReadInteger(){
    try {
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    } catch (Exception ex) {
        ex.printStackTrace();
        return 0;
    }
}