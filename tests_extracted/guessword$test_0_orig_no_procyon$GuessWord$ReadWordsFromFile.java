public static int ReadWordsFromFile(final String[] array){
    try {
        final FileReader in = new FileReader("words_input.txt");
        final BufferedReader bufferedReader = new BufferedReader(in);
        int n = 0;
        for (int i = 0; i < 100; ++i) {
            final String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            array[n++] = line;
        }
        in.close();
        return n;
    } catch (FileNotFoundException ex) {
        System.out.println(ex.getMessage());
        return -1;
    } catch (IOException ex2) {
        System.out.println(ex2.getStackTrace());
        return -1;
    }
}