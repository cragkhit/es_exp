public String toString(){
    String ans = "";
    for (int i = 0; i < square.length; i++) {
        for (int j = 0; j < square[i].length; j++) {
            ans = ans + square[i][j] + "\t";
        }
        ans = ans + "\n";
    }
    return ans;
}