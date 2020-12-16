package twoDimension;

import java.util.Scanner;

public class Maze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 0, 3, 3, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 0, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 1, 3, 1},
                {1, 0, 1, 0, 1, 0, 1, 1, 3, 1},
                {1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                {1, 5, 1, 1, 1, 0, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 4, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        };
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    System.out.print("█");
                } else if (board[i][j] == 2) {
                    System.out.print("★");
                } else if (board[i][j] == 3) {
                    System.out.print("~");
                } else if (board[i][j] == 4) {
                    System.out.print("◉");
                } else if (board[i][j] == 5) {
                    System.out.print("ᴥ");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}