public static void main(String[] a){
    java.io.BufferedReader a0 = new java.io.BufferedReader((java.io.Reader) new java.io.InputStreamReader(System.in));
    java.util.LinkedList a1 = new java.util.LinkedList();
    try {
        System.out.println("Input: ");
        String s = a0.readLine();
        int i = 0;
        while (i < s.length()) {
            int i0 = s.charAt(i);
            a1.add((Object) Character.valueOf((char) i0));
            i = i + 1;
        }
    } catch (Exception a2) {
        a2.printStackTrace();
    }
    java.util.LinkedList a3 = RailRoadCar.Rearrange(a1);
    System.out.println(a3.toString());
}