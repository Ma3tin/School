import java.util.Scanner;

public class PCV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej číslo");
        String input = sc.nextLine();
        String[] numbers = new String[input.length()];
        numbers = input.split(" ");
        int[] charara = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            charara[i] = Integer.parseInt(numbers[i]);
            System.out.println(charara[i]);
        }

    }
}
