package rvt;

import java.util.Scanner;

public class Odd_or_Even {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type number...");

        int number = reader.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        reader.close();
    }
}
