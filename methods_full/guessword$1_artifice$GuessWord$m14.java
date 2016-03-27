public static String m14(){
    try {
        String v8;
        v8 = "";
        InputStreamReader v9;
        v9 = new InputStreamReader(System.in);
        BufferedReader v10;
        v10 = new BufferedReader(v9);
        return v10.readLine();
    } catch (Exception v11) {
        v11.printStackTrace();
    }
    return "";
}