public static String m14(){
    try {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    } catch (Exception ex) {
        ex.printStackTrace();
        return "";
    }
}