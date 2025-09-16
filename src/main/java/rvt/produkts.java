package rvt;

import java.text.DecimalFormat;
import java.util.Scanner;

public class produkts {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

            System.out.println("Kadu produktu tu gribi iegadaties?");
                String input = reader.nextLine();
            
            System.out.println("cik daudz tu gribi iegadaties?");
                int number = reader.nextInt();

            System.out.println("produkta cena?");
                double price = reader.nextDouble();

            double totalprice = number * price;

            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("produkts: " + input);
            System.out.println("daudzums: " + number);
            System.out.println("cena: " + price);
            System.out.println("Iznakuma cena" + df.format(totalprice));
                reader.close();
    }
}