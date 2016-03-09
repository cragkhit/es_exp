public static void main(final String[] array){
    try {
        while (true) {
            System.out.print("\nEnter the number of discs (-1 to exit): ");
            final String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
            Main.a = 0;
            final int int1;
            if ((int1 = Integer.parseInt(line)) == -1) {
                break;
            }
            if (int1 <= 1 || int1 >= 10) {
                System.out.println("Enter between 2 - 9");
            } else {
                for (int i = int1; i > 0; --i) {
                    Main.b.push(i);
                }
                Main.e = Main.b.size();
                Main.f = Main.c.size();
                Main.g = Main.d.size();
                a();
                a(int1, Main.b, Main.c, Main.d);
                System.out.println("Total Moves = " + Main.a);
                while (Main.d.size() > 0) {
                    Main.d.pop();
                }
            }
        }
        System.out.println("Good Bye!");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}