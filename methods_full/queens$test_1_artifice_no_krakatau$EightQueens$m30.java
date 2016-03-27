public void m30(){
    System.out.println("Here is a solution:\n");
    int i = 0;
    while (i < this.f00.length) {
        int i0 = 0;
        while (i0 < this.f00.length) {
            if (this.f00[i0] != i) {
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