package Emanuele;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

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

                /*CREAZIONE CONTENUTI DENTRO NEWBOOKLIST E NEWMAGAZINELIST - CREAZIONE LISTA CATALOGO*/
                Collection<Object> catalogue = new ArrayList<>();
                catalogue.addAll(newBookList);
                catalogue.addAll(newMagazineList);
        System.out.println("------------ STAMPO CATALOGO PER PROVA ------------------");
        System.out.println(catalogue);

        System.out.println("Vuoi rimuovere un elemento e conosci il suo isbn? Inseriscilo qui:");
        int isbnToRemove = Integer.parseInt(input.nextLine());
        catalogue.stream().filter(isbn -> get)


                }
            }
