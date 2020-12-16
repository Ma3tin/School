package twoDimension;

import java.util.Scanner;

public class Sachy1oprava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] sachy = {
                {2, 3, 4, 5, 6, 4, 3, 2},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {7, 7, 7, 7, 7, 7, 7, 7},
                {8, 9, 10, 11, 12, 10, 9, 8}
        };
        for (int i = 0; i < sachy.length; i++) {
            for (int j = 0; j < sachy.length; j++) {
                if (sachy[i][j] == 1) {
                    System.out.print("♟");
                }else if (sachy[i][j] == 2) {
                    System.out.print("♜");
                }else if (sachy[i][j] == 3) {
                    System.out.print("♞");
                }else if (sachy[i][j] == 4) {
                    System.out.print("♝");
                }else if (sachy[i][j] == 5) {
                    System.out.print("♛");
                }else if (sachy[i][j] == 6) {
                    System.out.print("♚");
                }else if (sachy[i][j] == 7) {
                    System.out.print("♙");
                }else if (sachy[i][j] == 8) {
                    System.out.print("♖");
                }else if (sachy[i][j] == 9) {
                    System.out.print("♘");
                }else if (sachy[i][j] == 10) {
                    System.out.print("♗");
                }else if (sachy[i][j] == 11) {
                    System.out.print("♕");
                }else if (sachy[i][j] == 12) {
                    System.out.print("♔");
                }else if (sachy[i][j] == 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
