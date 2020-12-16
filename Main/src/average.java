public class average {
    public static void main(String[] args) {
        int[] pole = {1,2,3,4,5,6,7,8,9,10};
        int total = 0;
        for (int i = 0; i < pole.length; i++) {
            total += pole[i];
        }
        System.out.println("Průměr je: " + (total / pole.length));
    }
}