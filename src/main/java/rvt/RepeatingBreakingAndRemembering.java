package rvt;
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write numbers (-1 ends program)");

        int skaitlu_skaits = 0;
        int ievadito_skaitlu_summa = 0;
        int videjais_skaitlis = 0;
        int para_skaitli = 0;
        int nepara_skaitli = 0;


        while (true) {
            int ievaditais_sk = input.nextInt();
        if (ievaditais_sk != -1) {
            skaitlu_skaits = skaitlu_skaits + 1;
            ievadito_skaitlu_summa = ievadito_skaitlu_summa + ievaditais_sk;
            videjais_skaitlis = ievadito_skaitlu_summa / skaitlu_skaits;

        if (ievaditais_sk % 2 == 0) {
            para_skaitli = para_skaitli + 1;
            }

        else {
            nepara_skaitli = nepara_skaitli + 1;
            }
        }
            
        if (ievaditais_sk == -1)
            break;

        }
    System.out.println("Thx! Bye!");
    System.out.println("Sum: " + ievadito_skaitlu_summa);
    System.out.println("Numbers: " + skaitlu_skaits);
    System.out.println("Average: " + videjais_skaitlis);
    System.out.println("Even: "+ para_skaitli);
    System.out.println("Odd: " + nepara_skaitli);

    input.close();
    }
    
}
