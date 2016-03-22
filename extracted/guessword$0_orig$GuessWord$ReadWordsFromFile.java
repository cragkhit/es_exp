public static int ReadWordsFromFile(String[] words){
    try {
        FileReader fr = new FileReader("words_input.txt");
        BufferedReader br = new BufferedReader(fr);
        int count = 0;
        for (int i = 0; i < 100; i++) {
            String s = br.readLine();
            if (s == null) {
                break;
            }
            words[count++] = s;
        }
        fr.close();
        return count;
    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
        return -1;
    } catch (IOException err) {
        System.out.println(err.getStackTrace());
        return -1;
    }
}