package rvt;

import java.util.Scanner;

public class Gift_tax {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("value of the gift?");
            int gift = reader.nextInt();

        if ( gift < 5000) {
            System.out.println("No tax!");
        }

        else if (gift >= 5000 && gift <= 25000) {
            System.out.println("tax: " + (gift * 0.08));
        }

        else if (gift >= 25000 && gift <= 55000) {
            System.out.println("tax: " + (gift * 0.10));
        }

        else if (gift >= 55000 && gift <= 200000) {
            System.out.println("tax: " + (gift * 0.12));
        }

        else if (gift >= 200000 && gift <= 1000000) {
            System.out.println("tax: " + (gift * 0.15));
        }

        else {
            System.out.println("tax: " + (gift * 0.17));
        }
    }
}
