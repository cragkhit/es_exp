public static void main(final String[] array){
    System.out.print("Enter a 3 digit number for Kaprekar Tranformation: ");
    int readInteger = ReadInteger();
    if (readInteger < 0 || readInteger > 999) {
        System.out.println("Your input is not correct.");
    }
    final int n = readInteger / 100;
    final int n2 = (readInteger - n * 100) / 10;
    final int n3 = readInteger % 10;
    if (n == n2 && n == n3) {
        System.out.println("All digits should not be equal.");
        return;
    }
    while (true) {
        final int computeKaprekarTranformation = ComputeKaprekarTranformation(readInteger);
        if (readInteger == computeKaprekarTranformation) {
            break;
        }
        readInteger = computeKaprekarTranformation;
    }
}