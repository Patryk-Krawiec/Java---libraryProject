package pl.pkrawiec.library.app;

import pl.pkrawiec.library.io.DataReader;
import pl.pkrawiec.library.model.Book;
import pl.pkrawiec.library.model.Library;

public class LibraryControl {

    private final int exit = 0;
    private final int addBook = 1;
    private final int printBooks = 2;
    private DataReader dataReader = new DataReader();
    private Library library = new Library();

    public void controlLoop() {
        int option;

        do {
           printOptions();
           option = dataReader.getInt();
           switch (option) {
               case addBook:
                   addBook();
                   break;
               case printBooks:
                   printBooks();
                   break;
               case exit:
                   exit();
                   break;
               default:
                   System.out.println("Nie ma takiej opcji, wprowadź ponownie!");
           }
        } while (option != exit);
    }

    private void exit() {
        System.out.println("Koniec programu!");
        dataReader.close();
    }

    private void printBooks() {
        library.printBooks();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println(exit + " - wyjście z programu");
        System.out.println(addBook + " - dodanie nowej książki");
        System.out.println(printBooks + " - wyświetl dostępne książki");
    }
}
