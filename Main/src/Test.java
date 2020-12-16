import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = sc.nextInt();
        int[] numbers = new int[input];
        String[] pepa = new String[input];
        System.out.println("Enter numbers");
        for (int i = 0; i < input; i++) {
            numbers[i] = sc.nextInt();
        }
        int average = 0;
        for (int i = 0; i < numbers.length; i++) {
            average += numbers[i];
        }

        int biggest = numbers[0];
        int lowest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > biggest) {
                biggest = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }
        System.out.println("Average: " + (average / numbers.length));
        System.out.println("Největší číslo je: " + biggest + ". Nejmenší číslo je: " + lowest + ".");
    }
}
