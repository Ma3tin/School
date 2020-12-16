package twoDimension;

import java.util.Scanner;

public class Sachy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] sachy = {
                {"♜", "♞", "♝", "♛", "♚", "♝", "♞", "♜"},
                {"♟", "♟", "♟", "♟", "♟", "♟", "♟", "♟"},
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
                {"♙", "♙", "♙", "♙", "♙", "♙", "♙", "♙"},
                {"♖", "♘", "♗", "♕", "♔", "♗", "♘", "♖"}
        };
        for (int i = 0; i < sachy.length; i++) {
            for (int j = 0; j < sachy.length; j++) {
                String radek = sachy[i][j];
                System.out.print(radek);
            }
            System.out.println();
        }
    }
}
