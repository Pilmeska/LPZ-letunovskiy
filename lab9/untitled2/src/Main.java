public class Main {

    public static void main(String[] args) {
        LibrarianAdmin librarianAdmin = new LibrarianAdmin("Ksenia", 1993);
        Reader studentReader = new cReader("Reader1", 1995);
        Supplier supplier = new cSupplier ("Supplier1", 1991);


        librarianAdmin.orderBooks(supplier);
        librarianAdmin.findBooks();
        studentReader.pickUpBooks(6);
        studentReader.pickUpBooks(4);
        librarianAdmin.delayNotice(studentReader);
        studentReader.dropOffBooks(5);
        supplier.bringBooks();
    }
}