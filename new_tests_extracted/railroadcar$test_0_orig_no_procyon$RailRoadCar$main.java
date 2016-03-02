public static void main(final String[] array){
    final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    final LinkedList<Character> list = new LinkedList<Character>();
    try {
        System.out.println("Input: ");
        final String line = bufferedReader.readLine();
        for (int i = 0; i < line.length(); ++i) {
            list.add(line.charAt(i));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    System.out.println(Rearrange(list).toString());
}