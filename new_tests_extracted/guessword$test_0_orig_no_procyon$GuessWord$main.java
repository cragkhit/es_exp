public static void main(final String[] array){
    System.out.println("Welcome to Guess a Word\n");
    final String[] array2 = new String[100];
    final int readWordsFromFile = ReadWordsFromFile(array2);
    if (readWordsFromFile < 0) {
        System.out.println("No words found in the file");
        return;
    }
    final String str = array2[(int) (Math.random() * 100.0) % readWordsFromFile];
    final int length = str.length();
    System.out.print("Your secret word is: ");
    for (int i = 0; i < length; ++i) {
        System.out.print("*");
    }
    System.out.println();
    System.out.println("Guess now  (To stop the program, enter #) : ");
    String str2 = "";
    int n;
    while (true) {
        n = 1;
        final String readString = ReadString();
        if (readString.compareTo("#") == 0) {
            n = 0;
            break;
        }
        str2 += readString;
        if (str2.length() > 10) {
            str2 = str2.substring(0, 9);
        }
        int n2 = 0;
        String s = "";
        for (int j = 0; j < length; ++j) {
            boolean b = false;
            for (int k = 0; k < str2.length(); ++k) {
                if (readString.indexOf(str.charAt(j)) >= 0) {
                    n2 = 1;
                }
                if (str.charAt(j) == str2.charAt(k)) {
                    s += str.charAt(j);
                    b = true;
                    break;
                }
            }
            if (!b) {
                s += "*";
                n = 0;
            }
        }
        if (n2 == 1) {
            System.out.format("Correct: %s", s);
        } else {
            System.out.format("Wrong: %s", s);
        }
        if (n == 1) {
            break;
        }
        System.out.println();
        System.out.print("Guesses : ");
        for (int l = 0; l < str2.length(); ++l) {
            System.out.format("%c ", str2.charAt(l));
        }
        System.out.println();
        System.out.println();
        if (str2.length() >= 10) {
            System.out.print("You have reached maximum amount of guesses.");
            n = 0;
            break;
        }
    }
    if (n == 0) {
        System.out.println("\nUnfortunately you did not guess it correctly. The secret word is: " + str);
    } else {
        System.out.println("\nCongrats! You have guessed it correctly");
    }
}