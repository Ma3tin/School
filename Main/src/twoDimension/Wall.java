package twoDimension;

import java.util.Scanner;

public class Wall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] wall = {
                {" ", " ", " ", " ", " "},
                {" ", "█", "█", "█", " "},
                {" ", " ", "█", " ", " "},
                {" ", "█", "█", "█", " "},
                {" ", " ", " ", " ", " "}
        };
        for (int i = 0; i < wall.length; i++) {
            for (int j = 0; j < wall.length; j++) {
                System.out.print(wall[i][j]);

            }
            System.out.println();
        }
        boolean finito = true;
        System.out.println("Zadej X:");
        int x = sc.nextInt();
        System.out.println("Zadej Y:");
        int y = sc.nextInt();
        while (finito) {
            if (wall[x][y].equals(" ")) {
                wall[x][y] = "★";
                for (int i = 0; i < wall.length; i++) {
                    for (int j = 0; j < wall.length; j++) {
                        System.out.print(wall[i][j]);

                    }
                    System.out.println();
                }
                finito = false;
                break;
            } else {
                System.out.println("Na této pozici je zeď. Prosím zadej jiné body.");
                System.out.println("Zadej X:");
                x = sc.nextInt();
                System.out.println("Zadej Y:");
                y = sc.nextInt();
            }
        }
    }
}
