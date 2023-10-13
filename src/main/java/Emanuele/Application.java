package Emanuele;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

import Emanuele.entities.Book;
import Emanuele.entities.Magazine;
import Emanuele.entities.PublicationElement;
import Emanuele.entities.PublicationFrequency;

public class Application {

    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                List<Book> newBookList = new ArrayList<>();
                List<Magazine> newMagazineList = new ArrayList<>();
                System.out.println("Benvenuto nel catalogo bibliotecario." +
                        " Aggiungi un elemento: se vuoi inserire un libro, scrivi 'libro', " +
                        "altrimenti scrivi 'rivista'");
                String newInput = input.nextLine();
                System.out.println("Hai scelto di inserire " + newInput);
                switch (newInput) {
                    case "libro":
                    System.out.println("Inserisci un codice univoco numerico di 5 cifre:");
                    long newBookIsbn = Long.parseLong(input.nextLine());
                    System.out.println("Inserisci il titolo del libro:");
                    String newBookTitle = input.nextLine();
                    System.out.println("Inserisci l'anno di pubblicazione:");
                    int newBookYear = Integer.parseInt(input.nextLine());
                    System.out.println("Inserisci il numero di pagine totali del libro:");
                    int newBookPagesNum = Integer.parseInt(input.nextLine());
                    System.out.println("Inserisci l'autore principale del libro:");
                    String newBookAuthor = input.nextLine();
                    System.out.println("Inserisci il genere del libro:");
                    String newBookGenre = input.nextLine();
                    Book newBook = new Book(newBookIsbn, newBookTitle, newBookYear,newBookPagesNum, newBookAuthor,newBookGenre);
                    newBookList.add(newBook);
                        for (Book book : newBookList) {
                            System.out.println(book);
                        }
                        break;
                    case "rivista" :
                        System.out.println("Inserisci un codice univoco numerico di 4 cifre:");
                        long newMagIsbn = Long.parseLong(input.nextLine());
                        System.out.println("Inserisci il titolo della rivista:");
                        String newMagTitle = input.nextLine();
                        System.out.println("Inserisci l'anno di pubblicazione:");
                        int newMagYear = Integer.parseInt(input.nextLine());
                        System.out.println("Inserisci il numero di pagine totali della rivista:");
                        int newMagPagesNum = Integer.parseInt(input.nextLine());
                        System.out.println("Inserisci la periodicità di pubblicazione della rivista. " +
                                "Sono ammesse solo le seguenti: [Weekly, Monthly, Biannual]");
                        String newMagFrequency = input.nextLine();
                        Magazine newMagazine = new Magazine(newMagIsbn, newMagTitle, newMagYear, newMagPagesNum, newMagFrequency);
                        newMagazineList.add(newMagazine);
                        for (Magazine magazine : newMagazineList) {
                            System.out.println(magazine);
                        }
                        break;
                    default:
                        System.out.println("Non hai inserito uno tra i due valori richiesti. Riprova");
                }

                /*CREAZIONE CONTENUTI DENTRO NEWBOOKLIST E NEWMAGAZINELIST */

        Book book1 = new Book(10001, "Il signore degli anelli", 1969, 1400,"J.R.R. Tolkien", "Fantasy");
        Book book2 = new Book(10002, "Harry Potter e la pietra filosofale", 1994, 396,"J.K. Rowling", "Fantasy");
        Book book3 = new Book(10001, "Assassinio sull'Orient Express", 1934, 639,"Agatha Christie", "Crime Novel");
        Book book4 = new Book(10001, "Don Chisciotte della Mancia", 1476, 930,"J.R.R. Tolkien", "Adventure");
        Book book5 = new Book(10001, "La profezia dell'Aquila", 2004, 424,"Simon Scarrow", "History Novel");
        Book book6 = new Book(10001, "Uno studio in rosso", 1842, 390,"Arthur Conan Doyle", "Crime Novel");
        Book book7 = new Book(10001, "Alexandre", 1999, 1532,"Valerio Massimo Manfredi", "History Novel");

        newBookList.add(book1);
        newBookList.add(book2);
        newBookList.add(book3);
        newBookList.add(book4);
        newBookList.add(book5);
        newBookList.add(book6);
        newBookList.add(book7);

        Magazine magazine1 = new Magazine(2001, "Internazionale", 1965, 70, "Monthly");
        Magazine magazine2 = new Magazine(2002, "Focus", 1995, 25, "Weekly");
        Magazine magazine3 = new Magazine(2003, "The Economist", 1935, 90, "Biannual");;
        Magazine magazine4 = new Magazine(2004, "The New Yorker", 1920, 65, "Monthly");;
        Magazine magazine5 = new Magazine(2005, "Vogue", 1952, 120, "Monthly");;

        newMagazineList.add(magazine1);
        newMagazineList.add(magazine2);
        newMagazineList.add(magazine3);
        newMagazineList.add(magazine4);
        newMagazineList.add(magazine5);


        /* CREAZIONE LISTA CATALOGO */
        List<Object> catalogue = new ArrayList<>();
                catalogue.addAll(newBookList);
                catalogue.addAll(newMagazineList);
        System.out.println("------------ STAMPO CATALOGO PER PROVA ------------------");
        System.out.println(catalogue);

        System.out.println("Vuoi rimuovere un elemento e conosci il suo isbn? Inseriscilo qui:");
        int isbnToRemoveElement = Integer.parseInt(input.nextLine());

        Book bookToRemove = newBookList.stream().filter(element -> {
            return element.getIsbn() == (isbnToRemoveElement);
        }
        catalogue.remove(bookToRemove);
                System.out.println("non c'è alcun elemento con questo isbn");
            }
        }


