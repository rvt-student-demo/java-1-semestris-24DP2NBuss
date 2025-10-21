package rvt;

import java.util.Scanner;
import java.util.Random;

public class TheRandomClass {
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Es domaju par skaitli no 1 lidz 10.");
        System.out.println("Tev tas jauzmin 3 meiginajumos.");

        int rezultats = random.nextInt(11);
        System.out.println("Ievadi minejumu: "); 

        int skaitlis = 0;
        while (skaitlis != 3) {
            int ievaditais_sk = input.nextInt();
            if (rezultats == ievaditais_sk) {
                System.out.println("Pareizi!");
                System.out.println("Tu uzvareji speli!");
                break;
            }

            else{
                System.out.println("Nepareizi!!!");
                skaitlis = skaitlis + 1;
                continue;
            }

        }
        if (skaitlis == 3) {
            System.out.println("spele ir zaudeta");
            System.out.println("skaitlis bija " + rezultats);
        }
    }
}
