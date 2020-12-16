package test3;

public class Zlodej {
    public static void main(String[] args) {
        int cars = 0;
        int carBefore = 0;
        int pepis = 0;
        String haf = "";
        String[] lines = input.split("\n");
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains("X")) {
                pepis = lines[i].indexOf("X");
                String pepa = lines[i];
;                if (pepa.charAt(i) == '#') carBefore++;
            }
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'X') break;
            else if (input.charAt(i) == '#') cars++;

        }
        /*for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines[j].length(); i++) {
                if (lines[j].charAt(i) == 'X') break;
                else if (lines[j].charAt(i) == '#') cars++;
                if (lines[i].contains("X")) lines[i] = lines[i].replaceAll("#", ".");
            }
        }*/


        System.out.println(cars - carBefore);
    }
    static String input = "...O..\n" +
            ".#..#.\n" +
            ".....#\n" +
            "......\n" +
            ".#....\n" +
            "......\n" +
            "##....\n" +
            "#.X##.\n" +
            "..#..#\n" +
            "....#.\n" +
            "..##..";
}
