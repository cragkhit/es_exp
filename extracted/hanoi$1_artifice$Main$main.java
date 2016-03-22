public static void main(String[] v11){
    try {
        for (; true; ) {
            System.out.print("\nEnter the number of discs (-1 to exit): ");
            int v12;
            v12 = 0;
            String v13;
            v13 = "";
            InputStreamReader v14;
            v14 = new InputStreamReader(System.in);
            BufferedReader v15;
            v15 = new BufferedReader(v14);
            v13 = v15.readLine();
            f00 = 0;
            v12 = Integer.parseInt(v13);
            if (v12 == -1) {
                System.out.println("Good Bye!");
                return;
            }
            if (v12 <= 1 || v12 >= 10) {
                System.out.println("Enter between 2 - 9");
                continue;
            }
            int v16;
            v16 = v12;
            while (v16 >= 1) {
                f10.push(v16);
                v16 = v16 - 1;
            }
            f40 = f10.size();
            f50 = f20.size();
            f60 = f30.size();
            m20();
            m10(v12, f10, f20, f30);
            System.out.println("Total Moves = " + f00);
            for (; f30.size() > 0; ) {
                f30.pop();
            }
        }
    } catch (Exception v17) {
        v17.printStackTrace();
    }
}