package pl.pkrawiec.library.app;

import pl.pkrawiec.library.io.DataReader;
import pl.pkrawiec.library.model.Book;

class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.8";

//        Book[] books = new Book[1000];
//        books[0] = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010,
//                296, "Greg", "9523592359410");
//        books[1] = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch",
//                2009, 352, "Helion", "9788592359435");
//        books[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
//                "Bert Bates, Katherine Sierra", 2008, 851,
//                "McGraw-Hill Osborne Media");

        Book[] books = new Book[1000];
        DataReader dataReader = new DataReader();

        System.out.println(appName);
        System.out.println("Wprowadź nową książkę:");
        books[0] = dataReader.readAndCreateBook();
        books[1] = dataReader.readAndCreateBook();
        dataReader.close();

        books[0].printInfo();
        books[1].printInfo();
        System.out.println("System może przechowywać do " + books.length + " książek");
    }
}
