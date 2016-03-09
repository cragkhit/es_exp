public static void main(String[] args){
    String inpstring = "";
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(input);
    LinkedList q = new LinkedList();
    try {
        System.out.println("Input: ");
        inpstring = reader.readLine();
        int i = 0;
        for (i = 0; i < inpstring.length(); i++) {
            Object o = inpstring.charAt(i);
            boolean bRet = q.add(o);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    LinkedList result = Rearrange(q);
    System.out.println(result.toString());
}