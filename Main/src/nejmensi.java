public class nejmensi {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int biggest = numbers[0];
        int lovest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > biggest) {
                biggest = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < lovest) {
                lovest = numbers[i];
            }
        }
        System.out.println("Nejmenší číslo je: "+ lovest + ". Největší číslo je : "+biggest +".");
        System.out.println("Výsledek: " + (biggest - lovest));
    }
}
