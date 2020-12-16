public class p {
    public static void main(String[] args) {
        String pepa = "beve :sir";
        int beggim = pepa.indexOf(":sir");
        int end = pepa.indexOf(" " , beggim);
        System.out.println(end);
    }
}
