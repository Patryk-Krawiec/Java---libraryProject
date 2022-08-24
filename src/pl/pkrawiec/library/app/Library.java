package pl.pkrawiec.library.app;

import pl.pkrawiec.library.model.Book;

class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.5";

        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010,
                296, "Greg", "9523592359410");
        Book book2 = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch",
                2009, 352, "Helion", "9788592359435");
        Book book3 = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
                "Bert Bates, Katherine Sierra", 2008, 851,
                "McGraw-Hill Osborne Media");

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece: ");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}
