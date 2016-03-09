public void printSol(){
    System.out.println("Here is a solution:\n");
    int i = 0;
    while (i < this.perm.length) {
        int i0 = 0;
        while (i0 < this.perm.length) {
            if (this.perm[i0] != i) {
                System.out.print("_ ");
            } else {
                System.out.print("Q ");
            }
            i0 = i0 + 1;
        }
        System.out.println("\n");
        i = i + 1;
    }
}