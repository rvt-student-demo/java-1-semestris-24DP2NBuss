package rvt;
import java.util.Scanner;


public class Book {
    public static void main(String[] args) {
        Book book = new Book("", 0, 0);
    }

public Book (String bookTitle, int bookPages, int bookPubYear) {
    Scanner reader = new Scanner(System.in);

    while (true) {
        System.out.println("Title: ");
        bookTitle = reader.nextLine();
        if (bookTitle == "") {
            break;
        }
        System.out.println("Pages: ");
        bookPages = reader.nextInt();
        System.out.println("Publication year: ");
        bookPubYear = reader.nextInt();

        Book book = new Book(bookTitle, bookPages, bookPubYear);
        }
    }  
}
