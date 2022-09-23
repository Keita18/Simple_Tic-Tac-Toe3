package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        var col = "";
        var row = "";
        var rowI = 0;
        var player1 = 0;
        var player2 = 0;
        var result = "";
        var xCount = 0;
        var oCount = 0;

        for (int i=0; i<3; i++) {
            row = "" + input.charAt(rowI) +
                    input.charAt(++rowI) + input.charAt(++rowI);
            rowI++;
            col = ""+ input.charAt(i) +
                    input.charAt(i + 3) + input.charAt(i + 6);

            if (row.equals("XXX") || col.equals("XXX")) player1++;
            if (row.equals("OOO") || col.equals("OOO")) player2++;
        }
        var diag1 = "" + input.charAt(0) + input.charAt(4) + input.charAt(8);
        var diag2 = "" + input.charAt(2) + input.charAt(4) + input.charAt(6);
        if (diag1.equals("XXX") || diag2.equals("XXX")) player1++;
        if (diag1.equals("OOO") || diag2.equals("OOO")) player2++;

        for (char c : input.toCharArray()) {
            if (c == 'X') xCount ++;
            if (c == 'O') oCount ++;
        }
        if (player1 == 1 && player2 == 1) {
             result = "Impossible";
        } else if (Math.abs(xCount - oCount) >= 2){
            result = "Impossible";
        } else if (player1 == 1){
            result = "X wins";
        } else if (player2 == 1) {
            result =  "O wins";
        } else if (xCount + oCount == 9) {
            result = "Draw";
        } else if (xCount + oCount < 9) {
            result = "Game not finished";
        }
        print(input, result);
    }

    static void print(String input, String result) {
        System.out.println("---------");
        System.out.println("| " + input.charAt(0) + " " + input.charAt(1) + " " + input.charAt(2) + " |");
        System.out.println("| " + input.charAt(3) + " " + input.charAt(4) + " " + input.charAt(5) + " |");
        System.out.println("| " + input.charAt(6) + " " + input.charAt(7) + " " + input.charAt(8) + " |");
        System.out.println("---------");
        System.out.println(result);
    }
}
