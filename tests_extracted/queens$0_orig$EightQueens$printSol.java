public void printSol(){
    int i, j;
    System.out.println("Here is a solution:\n");
    for (i = 0; i < perm.length; i++) {
        for (j = 0; j < perm.length; j++) {
            if (perm[j] == i) {
                System.out.print("Q ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println("\n");
    }
}