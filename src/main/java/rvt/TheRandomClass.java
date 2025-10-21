package rvt;

import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

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
            int i = input.nextInt();
            skaitlis = skaitlis + 1;
            if (rezultats == i) {
                System.out.println("Pareizi!");
                break;
            }
            else{
                System.out.println("Nepareizi!!!");
                continue;
            }
        }
        if (skaitlis == 3) {
            System.out.println("spēle ir zaudēta");
            System.out.println("skaitlis bija " + rezultats);
        }
    }
}
