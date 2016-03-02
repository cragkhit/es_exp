public static void main(String[] v11){
    String v12;
    v12 = "";
    InputStreamReader v13;
    v13 = new InputStreamReader(System.in);
    BufferedReader v14;
    v14 = new BufferedReader(v13);
    LinkedList v15;
    v15 = new LinkedList();
    try {
        System.out.println("Input: ");
        v12 = v14.readLine();
        int v16;
        v16 = 0;
        v16 = 0;
        while (v16 < v12.length()) {
            Object v17;
            v17 = v12.charAt(v16);
            boolean v18;
            v18 = v15.add(v17);
            v16 = v16 + 1;
        }
    } catch (Exception v19) {
        v19.printStackTrace();
    }
    LinkedList v20;
    v20 = m03(v15);
    System.out.println(v20.toString());
}