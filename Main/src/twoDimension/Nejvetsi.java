package twoDimension;

import java.util.Scanner;

public class Nejvetsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arrays = {
                {2, 3, 4, 5, 6, 4, 3, 2},
                {8, 9, 10, 11, 12, 10, 9, 8}
        };
        int nejvetsi1 = 0;
        int nejvetsi2 = 0;
        for (int i = 0; i < arrays[0].length; i++) {
            if (arrays[0][i] > nejvetsi1) {
                nejvetsi1 = arrays[0][i];
            }
        }
        for (int i = 0; i < arrays[1].length; i++) {
            if (arrays[1][i] > nejvetsi2) {
                nejvetsi2 = arrays[1][i];
            }
        }
        System.out.println(nejvetsi1);
        System.out.println(nejvetsi2);
    }
}
