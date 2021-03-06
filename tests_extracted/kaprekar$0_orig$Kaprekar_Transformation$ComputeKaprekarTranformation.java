static int ComputeKaprekarTranformation(int number){
    int a1, a2, a3;
    int d1, d2, d3;
    int big, small, diff;
    int digit1 = number / 100;
    int digit2 = (number - digit1 * 100) / 10;
    int digit3 = (number % 10);
    if (digit1 > digit2) {
        if (digit1 > digit3) {
            d1 = digit1;
            if (digit2 > digit3) {
                d2 = digit2;
                d3 = digit3;
            } else {
                d3 = digit2;
                d2 = digit3;
            }
        } else {
            d1 = digit3;
            d2 = digit1;
            d3 = digit2;
        }
    } else {
        if (digit2 > digit3) {
            d1 = digit2;
            if (digit1 > digit3) {
                d2 = digit1;
                d3 = digit3;
            } else {
                d3 = digit1;
                d2 = digit3;
            }
        } else {
            d1 = digit3;
            d2 = digit2;
            d3 = digit1;
        }
    }
    if (digit1 < digit2) {
        if (digit1 < digit3) {
            a1 = digit1;
            if (digit2 < digit3) {
                a2 = digit2;
                a3 = digit3;
            } else {
                a3 = digit2;
                a2 = digit3;
            }
        } else {
            a1 = digit3;
            a2 = digit1;
            a3 = digit2;
        }
    } else {
        if (digit2 < digit3) {
            a1 = digit2;
            if (digit1 < digit3) {
                a2 = digit1;
                a3 = digit3;
            } else {
                a3 = digit1;
                a2 = digit3;
            }
        } else {
            a1 = digit3;
            a2 = digit2;
            a3 = digit1;
        }
    }
    big = d1 * 100 + d2 * 10 + d3;
    small = a1 * 100 + a2 * 10 + a3;
    diff = big - small;
    System.out.format("%d - %d = %d\n", big, small, diff);
    return diff;
}