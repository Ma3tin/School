package AoC;

import java.io.BufferedReader;
import java.io.FileReader;

public class TWO {
    public static void main(String[] args) {
        int validni = 0;
        int pocet = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\matym\\IdeaProjects\\Main\\src\\AoC\\AoC-day2.txt")))
        {
            String s;
            while ((s = br.readLine()) != null)
            {
                System.out.println(s);
                String[] rozdeleno = s.split(" ");
                String[] minMax = rozdeleno[0].split("-");
                int min = Integer.parseInt(minMax[0]);
                int max = Integer.parseInt(minMax[1]);
                char pismeno = rozdeleno[1].charAt(0);
                String heslo = rozdeleno[2];
                if(pismeno == heslo.charAt(min-1)) pocet++;
                if(pismeno == heslo.charAt(max-1)) pocet++;

                if(pocet == 1) validni++;
                System.out.println(validni);
                pocet = 0;

//                for (int i = 0; i < heslo.length(); i++) {
//                    if(pismeno == heslo.charAt(i)) pocet++;
//                }
//                if(pocet >= min && pocet<=max) {
//                    validni++;
//                    System.out.println(validni);
//                }
//                pocet = 0;
            }
        }
        catch (Exception e)
        {
            System.err.println("Chyba při čtení ze souboru.");
        }
    }
}
