import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej seznam čísel:");
        String setOne = sc.nextLine();
        String[] italOne = setOne.split(",");
        int[] charOne = new int[italOne.length];
        String setTwo = sc.nextLine();
        String[] italTwo = setTwo.split(",");
        int[] charTwo = new int[italTwo.length];
        for (int i = 0; i < italOne.length; i++) {
            charOne[i] = Integer.parseInt(italOne[i]);
        }
        for (int i = 0; i < italTwo.length; i++) {
            charTwo[i] = Integer.parseInt(italTwo[i]);
        }
        String total = "";
        for (int i = 0; i < charOne.length; i++) {
            for (int j = 0; j < charTwo.length; j++) {
                if (charOne[i] == charTwo[j]) {
                    total = total + ", " +  charOne[i];
                }else {
                    System.out.print("");
                }
            }
        }
        System.out.print("Průnik těch to dvou množin je:");
        String[] ital = total.split(",");
        boolean comma = false;
        for (int i = 1; i < ital.length; i++) {
            if (comma) {
                System.out.print(",");
            }
            System.out.print(ital[i]);
            comma = true;
        }
    }
}