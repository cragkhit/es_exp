public static void main(String[] a0){
    try {
        while (true) {
            System.out.print("\nEnter the number of discs (-1 to exit): ");
            String s = new java.io.BufferedReader((java.io.Reader) new java.io.InputStreamReader(System.in)).readLine();
            a = 0;
            int i = Integer.parseInt(s);
            if (i != -1) {
                if (i > 1 && i < 10) {
                    int i0 = i;
                    while (i0 > 0) {
                        b.push((Object) Integer.valueOf(i0));
                        i0 = i0 + -1;
                    }
                    e = b.size();
                    f = c.size();
                    g = d.size();
                    Main.a();
                    Main.a(i, b, c, d);
                    System.out.println(new StringBuilder("Total Moves = ").append(a).toString());
                    while (d.size() > 0) {
                        d.pop();
                    }
                    continue;
                }
                System.out.println("Enter between 2 - 9");
            } else {
                break;
            }
        }
        System.out.println("Good Bye!");
    } catch (Exception a1) {
        a1.printStackTrace();
        return;
    }
}