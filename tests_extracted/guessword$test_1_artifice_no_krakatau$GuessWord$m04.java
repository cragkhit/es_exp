public static int m04(String[] a){
    java.io.FileNotFoundException a0 = null;
    try {
        try {
            java.io.FileReader a1 = new java.io.FileReader("words_input.txt");
            java.io.BufferedReader a2 = new java.io.BufferedReader((java.io.Reader) a1);
            int i = 0;
            int i0 = 0;
            while (true) {
                if (i0 < 100) {
                    String s = a2.readLine();
                    if (s != null) {
                        a[i] = s;
                        i = i + 1;
                        i0 = i0 + 1;
                        continue;
                    }
                }
                a1.close();
                return i;
            }
        } catch (java.io.FileNotFoundException a3) {
            a0 = a3;
        }
    } catch (java.io.IOException a4) {
        System.out.println((Object) a4.getStackTrace());
        return -1;
    }
    System.out.println(a0.getMessage());
    return -1;
}