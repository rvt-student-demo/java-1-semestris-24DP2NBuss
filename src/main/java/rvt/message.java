package rvt;

import java.util.Scanner;

public class message {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Write a Message");

        String input = reader.nextLine();

        System.out.println(input);
        reader.close();
    }
}
