public static void main(String[] a){
    try {
        while (true) {
            System.out.print("\nEnter the number of discs (-1 to exit): ");
            String s = new java.io.BufferedReader((java.io.Reader) new java.io.InputStreamReader(System.in)).readLine();
            f00 = 0;
            int i = Integer.parseInt(s);
            if (i != -1) {
                if (i > 1 && i < 10) {
                    int i0 = i;
                    while (i0 >= 1) {
                        f10.push((Object) Integer.valueOf(i0));
                        i0 = i0 - 1;
                    }
                    f40 = f10.size();
                    f50 = f20.size();
                    f60 = f30.size();
                    Main.m20();
                    Main.m10(i, f10, f20, f30);
                    System.out.println(new StringBuilder().append("Total Moves = ").append(f00).toString());
                    while (f30.size() > 0) {
                        f30.pop();
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