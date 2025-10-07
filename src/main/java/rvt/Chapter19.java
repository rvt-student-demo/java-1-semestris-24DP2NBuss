package rvt;

import java.util.Scanner;

public class Chapter19 {
    public static void main(String[] arg) {
            ex5();


    }



    public static void ex1() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter start value:");
            int start = reader.nextInt();

        System.out.println("Enter end value:");
            int End = reader.nextInt();
        System.out.println(" ");

        while( start <= End) {
            System.out.println(start);
                start = start + 1;
        }

        reader.close();
    }



    public static void ex2() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter N:");
        int N = reader.nextInt();

        int number = 1;
        int sumloop = number;

        while(number < N) {
            number = (number + 1);
            sumloop = sumloop + number;
        }
        System.out.println("Loop sum = " + sumloop);


        int sumformula = ((N*(N+1))/2);
        System.out.println("Formula sum = " + sumformula);

        reader.close();
    }



    public static void ex3() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter N:");
        int N = reader.nextInt();

        int number = 1;
        int sumloop = number;

        while(number < N) {
            number = (number + 1);
            sumloop += number * number;
        }
        System.out.println("Loop sum = " + sumloop);

        int sumformula= (N*(N+1)*(2*N+1))/6;
        System.out.println("Formula sum = " + sumformula);

        reader.close();
    }



    public static void ex4() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter low:");
            int low = reader.nextInt();

        System.out.println("Enter high");
            int high = reader.nextInt();
        System.out.println(" ");
        int sum = low;

        while(low < high) { 
            low = low + 1;
            sum = sum + low;
        }
            System.out.println("Sum = " + sum);

            reader.close();
        }

        public static void ex5() {
            Scanner reader = new Scanner(System.in);

            System.out.println("Enter a word: ");
                String word = reader.next();
            System.out.println(" ");

                int times = 1;
                int NumOfTimes;
                NumOfTimes = word.length();

                while (times <= NumOfTimes) {
                    System.out.println(word);
                    times = times + 1;

                }

            reader.close();
        }

}
