public class odd {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int liche = 0;
        int sude = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sude++;
            }
            else {
                liche++;
            }
        }
        System.out.println("Líché " + liche + " a sudé " + sude);
    }
}
