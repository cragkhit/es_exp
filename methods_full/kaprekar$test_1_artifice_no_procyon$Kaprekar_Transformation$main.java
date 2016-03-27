public static void main(final String[] array){
    System.out.print("Enter a 3 digit number for Kaprekar Tranformation: ");
    int m01 = m01();
    if (m01 < 0 || m01 > 999) {
        System.out.println("Your input is not correct.");
    }
    final int n = m01 / 100;
    final int n2 = (m01 - n * 100) / 10;
    final int n3 = m01 % 10;
    if (n == n2 && n == n3) {
        System.out.println("All digits should not be equal.");
        return;
    }
    while (true) {
        final int m2 = m11(m01);
        if (m01 == m2) {
            break;
        }
        m01 = m2;
    }
}