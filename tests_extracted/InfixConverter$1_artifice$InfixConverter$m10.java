public static int m10(){
    try {
        InputStreamReader v3;
        v3 = new InputStreamReader(System.in);
        BufferedReader v4;
        v4 = new BufferedReader(v3);
        return Integer.parseInt(v4.readLine());
    } catch (Exception v5) {
        v5.printStackTrace();
        return 0;
    }
}