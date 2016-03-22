public static String m00(){
    try {
        InputStreamReader v0;
        v0 = new InputStreamReader(System.in);
        BufferedReader v1;
        v1 = new BufferedReader(v0);
        return v1.readLine();
    } catch (Exception v2) {
        v2.printStackTrace();
        return "";
    }
}