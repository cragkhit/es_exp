public static void main(String[] a){
    try {
        while (true) {
            System.out.print("\nEnter the number of discs (-1 to exit): ");
            String s = new java.io.BufferedReader((java.io.Reader) new java.io.InputStreamReader(System.in)).readLine();
            movecount = 0;
            int i = Integer.parseInt(s);
            if (i != -1) {
                if (i > 1 && i < 10) {
                    int i0 = i;
                    while (i0 >= 1) {
                        A.push((Object) Integer.valueOf(i0));
                        i0 = i0 + -1;
                    }
                    countA = A.size();
                    countB = B.size();
                    countC = C.size();
                    Main.PrintStacks();
                    Main.SolveTOH(i, A, B, C);
                    System.out.println(new StringBuilder().append("Total Moves = ").append(movecount).toString());
                    while (C.size() > 0) {
                        C.pop();
                    }
                    continue;
                }
                System.out.println("Enter between 2 - 9");
            } else {
                break;
            }
        }
        System.out.println("Good Bye!");
    } catch (Exception a0) {
        a0.printStackTrace();
        return;
    }
}