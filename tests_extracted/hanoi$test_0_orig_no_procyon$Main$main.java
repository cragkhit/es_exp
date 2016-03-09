public static void main(final String[] array){
    try {
        while (true) {
            System.out.print("\nEnter the number of discs (-1 to exit): ");
            final String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
            Main.movecount = 0;
            final int int1 = Integer.parseInt(line);
            if (int1 == -1) {
                break;
            }
            if (int1 <= 1 || int1 >= 10) {
                System.out.println("Enter between 2 - 9");
            } else {
                for (int i = int1; i >= 1; --i) {
                    Main.A.push(i);
                }
                Main.countA = Main.A.size();
                Main.countB = Main.B.size();
                Main.countC = Main.C.size();
                PrintStacks();
                SolveTOH(int1, Main.A, Main.B, Main.C);
                System.out.println("Total Moves = " + Main.movecount);
                while (Main.C.size() > 0) {
                    Main.C.pop();
                }
            }
        }
        System.out.println("Good Bye!");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}