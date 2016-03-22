public static void main(String[] a){
    System.out.print("Enter a 3 digit number for Kaprekar Tranformation: ");
    int i = Kaprekar_Transformation.m01();
    label0: {
        label1: {
            if (i < 0) {
                break label1;
            }
            if (i <= 999) {
                break label0;
            }
        }
        System.out.println("Your input is not correct.");
    }
    int i0 = i / 100;
    int i1 = (i - i0 * 100) / 10;
    int i2 = i % 10;
    if (i0 == i1 && i0 == i2) {
        System.out.println("All digits should not be equal.");
        return;
    }
    while (true) {
        int i3 = Kaprekar_Transformation.m11(i);
        if (i == i3) {
            return;
        }
        i = i3;
    }
}