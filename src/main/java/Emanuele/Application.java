package Emanuele;

import java.util.Scanner;
import Emanuele.entities.PublicationFrequency;

public class Application {

    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
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
                        break;
                    default:
                        System.out.println("Non hai inserito uno tra i due valori richiesti. Riprova");
                        input.close();
                }

                }
            }
