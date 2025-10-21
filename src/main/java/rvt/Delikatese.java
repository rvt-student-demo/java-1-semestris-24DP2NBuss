package rvt;

import java.util.Scanner;

public class Delikatese {
    
    public static void main(String[] arg) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Sam & Ella shop");

        System.out.println("Ievadi preci: ");
            String prece = reader.nextLine();
        System.out.println("Ievadi preces cenu: ");
            Double cena = reader.nextDouble();

        Double piegades_cena = 5.00;

        System.out.println("Ekspress piegade (0 == ne, 1 == ja): ");
            int piegade = reader.nextInt();

        System.out.println("Rekins: ");
        System.out.println("   " + prece + "    "+ cena + "0");
        System.out.println("   Piegade    "   + piegades_cena + "0");

        if (piegade == 1) {
        System.out.println("   Kopa     " + (cena + piegades_cena) + "0");
    }

    else{
        System.out.println("   Kopa     " + cena + "0");
    }


    }
    
}
