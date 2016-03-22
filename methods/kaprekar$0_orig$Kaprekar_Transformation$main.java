public static void main(String[] args){
    System.out.print("Enter a 3 digit number for Kaprekar Tranformation: ");
    int number = ReadInteger();
    if (number < 0 || number > 999) {
        System.out.println("Your input is not correct.");
    }
    int digit1 = number / 100;
    int digit2 = (number - digit1 * 100) / 10;
    int digit3 = (number % 10);
    if (digit1 == digit2 && digit1 == digit3) {
        System.out.println("All digits should not be equal.");
        return;
    }
    while (true) {
        int nextnumber = ComputeKaprekarTranformation(number);
        if (number == nextnumber) {
            break;
        }
        number = nextnumber;
    }
}