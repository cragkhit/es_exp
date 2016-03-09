public static int m04(String[] v0){
    try {
        FileReader v1;
        v1 = new FileReader("words_input.txt");
        BufferedReader v2;
        v2 = new BufferedReader(v1);
        int v3;
        v3 = 0;
        int v4;
        v4 = 0;
        while (v4 < 100) {
            String v5;
            v5 = v2.readLine();
            if (v5 == null) {
                break;
            }
            v0[+v3] = v5;
            v3 = v3 + 1;
            v4 = v4 + 1;
        }
        v1.close();
        return v3;
    } catch (FileNotFoundException v6) {
        System.out.println(v6.getMessage());
        return -1;
    } catch (IOException v7) {
        System.out.println(v7.getStackTrace());
        return -1;
    }
}