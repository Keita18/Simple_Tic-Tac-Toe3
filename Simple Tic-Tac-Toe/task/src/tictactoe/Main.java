package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[][] grid = new char[3][3];
        int charIndex = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = input.charAt(charIndex);
                charIndex++;
            }
        }
        print(grid);
        String move;
        do {
            var coordinates = scanner.nextLine();
            move = move(grid, coordinates);
            if (move != null) System.out.println(move);
        } while (move != null);
        print(grid);
    }

    static String move(char[][] arr, String coordinates) {
        int col;
        int row;

        try {
            col = Integer.parseInt(coordinates.split(" ")[0]);
            row = Integer.parseInt(coordinates.split(" ")[1]);
        } catch (Exception e) {
            return  "You should enter numbers";
        }
        if (col > 3 || row > 3 || col < 1 || row < 1)
            return  "Coordinates should be from 1 to 3!";
        if (arr[--col][--row] == '_') {
            arr[col][row] = 'X';
            return null;
        }
        return "This cell is occupied! Choose another one!";
    }

    static void print(char[][] input) {
        System.out.println("---------");
        System.out.println("| " + input[0][0] + " " + input[0][1] + " " + input[0][2] + " |");
        System.out.println("| " + input[1][0] + " " + input[1][1] + " " + input[1][2] + " |");
        System.out.println("| " + input[2][0] + " " + input[2][1] + " " + input[2][2] + " |");
        System.out.println("---------");
    }
    /*    static void game(String input) {
        var col = "";
        var row = "";
        var rowI = 0;
        var player1 = 0;
        var player2 = 0;
        var result = "";
        var xCount = 0;
        var oCount = 0;

        for (int i = 0; i < 3; i++) {
            row = "" + input.charAt(rowI) +
                    input.charAt(++rowI) + input.charAt(++rowI);
            rowI++;
            col = "" + input.charAt(i) +
                    input.charAt(i + 3) + input.charAt(i + 6);

            if (row.equals("XXX") || col.equals("XXX")) player1++;
            if (row.equals("OOO") || col.equals("OOO")) player2++;
        }
        var diag1 = "" + input.charAt(0) + input.charAt(4) + input.charAt(8);
        var diag2 = "" + input.charAt(2) + input.charAt(4) + input.charAt(6);
        if (diag1.equals("XXX") || diag2.equals("XXX")) player1++;
        if (diag1.equals("OOO") || diag2.equals("OOO")) player2++;

        for (char c : input.toCharArray()) {
            if (c == 'X') xCount++;
            if (c == 'O') oCount++;
        }
        if (player1 == 1 && player2 == 1) {
            result = "Impossible";
        } else if (Math.abs(xCount - oCount) >= 2) {
            result = "Impossible";
        } else if (player1 == 1) {
            result = "X wins";
        } else if (player2 == 1) {
            result = "O wins";
        } else if (xCount + oCount == 9) {
            result = "Draw";
        } else if (xCount + oCount < 9) {
            result = "Game not finished";
        }
        print(input, result);
    }
*/
}
