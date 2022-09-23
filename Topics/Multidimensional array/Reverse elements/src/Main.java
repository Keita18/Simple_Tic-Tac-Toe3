class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        int colLeng = 0;
        for (int [] ar : twoDimArray) {
            int rowLeng = twoDimArray[0].length;
            for (int el : ar) {
                twoDimArray[colLeng][rowLeng -1 ] = el;
                rowLeng--;
            }
            colLeng++;
        }
    }
}