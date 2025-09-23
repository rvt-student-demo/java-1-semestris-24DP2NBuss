package rvt;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Bob's discounts Bolts piemro sadas cenas: ");

        int skruve_cena = 5;
        int uzgrieznis_cena = 3;
        int paplāksnis_cena = 1;

        System.out.println("Cik skruves tu gribi iegadaties?");
            int skruve = reader.nextInt();

        System.out.println("Cik uzgriezus tu gribi iegadaties?");
            int uzgrieznis = reader.nextInt();

        System.out.println("Cik paplaksnus tu gribi iegadaties?");
            int paplāksnis = reader.nextInt();

        int kopejacena = (skruve * skruve_cena + uzgrieznis * uzgrieznis_cena + paplāksnis * paplāksnis_cena);

        
        if (skruve == uzgrieznis && paplāksnis == skruve * 2) {
            System.out.println("Pasutijums ir kārtībā");
            System.out.println("Kopeja cena:" + kopejacena);
        }
        else if (skruve != uzgrieznis && paplāksnis != skruve * 2) {
            System.out.println("Parbaudi pasutijumu: par maz skruves vai uzgriezni un paplaksni");
            System.out.println("Kopeja cena:" + kopejacena);
        }
        else if (skruve > uzgrieznis) {
            System.out.println("Parbaudi pasutijumu: par maz uzgrieznu");
            System.out.println("Kopeja cena:" + kopejacena);
        }
        else if (uzgrieznis > skruve) {
            System.out.println("Parbaudi pasutijumu: par maz skruves");
            System.out.println("Kopeja cena:" + kopejacena);
        }
        else if (paplāksnis != skruve * 2) {
            System.out.println("Parbaudi pasutijumu: par maz paplaksnu");
            System.out.println("Kopeja cena:" + kopejacena);
        }
        reader.close();
    }
}
