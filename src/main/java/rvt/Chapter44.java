package rvt;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Chapter44 {
    public static void main(String[] args) {

        WordTriangle();
        }       

    public static void NameEcho() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();

    while (true) {
        System.out.println("Enter your name: ");
            String fullName = scanner.nextLine().trim();
            int spaceIndex = fullName.indexOf(" ");

        if (spaceIndex > 0) {
            String firstName = fullName.substring(0, spaceIndex);
            String lastName = fullName.substring(spaceIndex + 1);

            String result = firstName + " " + lastName.toUpperCase();
            System.out.println(result);
        } else {
            System.out.println(fullName);
            }
        }
    }


    public static void CharAt() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a string: ");
        String input = scanner.nextLine();
    System.out.println();

    for (int i = 0; i < input.length(); i++) {
        System.out.println(input.charAt(i));
        }
    }


    public static void TitleApplier() {
    Scanner scanner = new Scanner(System.in);

    List<String> femaleNames = List.of("Amy", "Buffy", "Cathy");
    List<String> maleNames = List.of("Elroy", "Fred", "Graham");

    while (true) {
        System.out.print("Enter a name: ");
            String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            break;
        }

        int spaceIndex = name.indexOf(" ");
        String firstname;

        if (spaceIndex == -1) {
            firstname = name;
        } else {
            firstname = name;

        String title = "";
        if (femaleNames.contains(firstname)) {
            title = "Ms. ";
        } else if (maleNames.contains(firstname)) {
            title = "Mr. ";
        }

        System.out.println(title + name);
        }
    }
}
    

    public static void MicrowaveMenu() {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cook time: ");
            String digits = scanner.nextLine().trim();
        String output;

        if (digits.length() <= 2) {
            output = "0:" + digits;
        } 
        String minutes = digits.substring(0, digits.length() - 2);
        String seconds = digits.substring(digits.length() - 2);{
        output = minutes + ":" + seconds;
        }

        System.out.println("Your time ->131 " + output);
        }


    public static void PasswordChecker() {
    Scanner scanner = new Scanner(System.in);
        
    while (true) {
        System.out.println("Enter your password: ");
            String password = scanner.nextLine();

        boolean isenough = password.length() >= 7;
        boolean upperCase = !password.equals(password.toLowerCase());
        boolean lowerCase = !password.equals(password.toUpperCase());
        boolean digits = false;

    for (char c : password.toCharArray()) {
        if (Character.isDigit(c)) {
            digits = true;
                break;
            }
        }

    if (isenough && upperCase && lowerCase && digits) {
        System.out.println("Acceptable password!");
            break;
    } else {
            System.out.println("Password is not acceptable!");
        }
    }
}


    public static void WordTriangle() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a word: ");
    String word = scanner.nextLine();

    int space = 0;

    while (word.length() > 0) {
        System.out.print(" ".repeat(space));
        System.out.println(word);

    if (word.length() > 1) {
        word = word.substring(1);
    } else {
        word = " ";
    }
            
    if (word.length() > 0) {
        word = word.substring(0, word.length() - 1);
    }

        space++;
        }  
    }
}


