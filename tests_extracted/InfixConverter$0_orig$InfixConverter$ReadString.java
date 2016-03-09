public static String ReadString(){
    try {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        return reader.readLine();
    } catch (Exception e) {
        e.printStackTrace();
        return "";
    }
}