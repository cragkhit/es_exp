public static int ReadInteger(){
    try {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        return Integer.parseInt(reader.readLine());
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}