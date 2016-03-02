public static void main(final String[] array){
    try {
        while (true) {
            System.out.print("\nEnter the number of discs (-1 to exit): ");
            final String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
            Main.f00 = 0;
            final int int1 = Integer.parseInt(line);
            if (int1 == -1) {
                break;
            }
            if (int1 <= 1 || int1 >= 10) {
                System.out.println("Enter between 2 - 9");
            } else {
                for (int i = int1; i >= 1; --i) {
                    Main.f10.push(i);
                }
                Main.f40 = Main.f10.size();
                Main.f50 = Main.f20.size();
                Main.f60 = Main.f30.size();
                m20();
                m10(int1, Main.f10, Main.f20, Main.f30);
                System.out.println("Total Moves = " + Main.f00);
                while (Main.f30.size() > 0) {
                    Main.f30.pop();
                }
            }
        }
        System.out.println("Good Bye!");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}