public static void main(String[] v16){
    System.out.print("Enter a 3 digit number for Kaprekar Tranformation: ");
    int v17;
    v17 = m01();
    if (v17 < 0 || v17 > 999) {
        System.out.println("Your input is not correct.");
    }
    int v18;
    v18 = v17 / 100;
    int v19;
    v19 = (v17 - v18 * 100) / 10;
    int v20;
    v20 = (v17 % 10);
    if (v18 == v19 && v18 == v20) {
        System.out.println("All digits should not be equal.");
        return;
    }
    for (; true; ) {
        int v21;
        v21 = m11(v17);
        if (v17 == v21) {
            break;
        }
        v17 = v21;
    }
}