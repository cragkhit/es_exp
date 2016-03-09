public void m30(){
    int v9, v10;
    System.out.println("Here is a solution:\n");
    v9 = 0;
    while (v9 < f00.length) {
        v10 = 0;
        while (v10 < f00.length) {
            if (f00[v10] == v9) {
                System.out.print("Q ");
            } else {
                System.out.print("_ ");
            }
            v10 = v10 + 1;
        }
        System.out.println("\n");
        v9 = v9 + 1;
    }
}