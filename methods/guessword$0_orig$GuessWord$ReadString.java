public static String ReadString(){
    try {
        String inpString = "";
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        return reader.readLine();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return "";
}