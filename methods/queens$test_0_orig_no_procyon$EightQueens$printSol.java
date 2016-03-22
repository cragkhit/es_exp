public void printSol(){
    System.out.println("Here is a solution:\n");
    for (int i = 0; i < this.perm.length; ++i) {
        for (int j = 0; j < this.perm.length; ++j) {
            if (this.perm[j] == i) {
                System.out.print("Q ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println("\n");
    }
}