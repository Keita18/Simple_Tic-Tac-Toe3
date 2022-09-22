import java.util.Scanner;

class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        // write your code here
        int firstC = twoDimArray[0][0];
        int secondC = twoDimArray[0][twoDimArray[0].length - 1];
        int thirdC = twoDimArray[twoDimArray.length - 1][0];
        int fourthC = twoDimArray[twoDimArray.length - 1][twoDimArray[0].length - 1];

        System.out.println(firstC + " " + secondC);
        System.out.println(thirdC + " " + fourthC);
    }

}