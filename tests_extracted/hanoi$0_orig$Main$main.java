public static void main(String[] args){
    try {
        while (true) {
            System.out.print("\nEnter the number of discs (-1 to exit): ");
            int maxdisc = 0;
            String inpstring = "";
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(input);
            inpstring = reader.readLine();
            movecount = 0;
            maxdisc = Integer.parseInt(inpstring);
            if (maxdisc == -1) {
                System.out.println("Good Bye!");
                return;
            }
            if (maxdisc <= 1 || maxdisc >= 10) {
                System.out.println("Enter between 2 - 9");
                continue;
            }
            for (int i = maxdisc; i >= 1; i--) {
                A.push(i);
            }
            countA = A.size();
            countB = B.size();
            countC = C.size();
            PrintStacks();
            SolveTOH(maxdisc, A, B, C);
            System.out.println("Total Moves = " + movecount);
            while (C.size() > 0) {
                C.pop();
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}