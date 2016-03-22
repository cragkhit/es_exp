public void m30(){
    System.out.println("Here is a solution:\n");
    for (int i = 0; i < this.f00.length; ++i) {
        for (int j = 0; j < this.f00.length; ++j) {
            if (this.f00[j] == i) {
                System.out.print("Q ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println("\n");
    }
}