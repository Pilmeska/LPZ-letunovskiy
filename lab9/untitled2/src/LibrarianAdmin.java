public class LibrarianAdmin extends Users implements Librarian, Admin {

    public LibrarianAdmin(String name, int dateOfBirth) {
        super(name, dateOfBirth);
    }

    @Override
    public void orderBooks(Supplier supplier) {
        System.out.printf(
                "%s ordered new books from supplier %n", this.getName(), supplier.toString());
    }

    @Override
    public void findBooks() {
        System.out.printf("%s found books%n", this.getName());
    }

    @Override
    public void delayNotice(Reader reader) {
        //TODO add boolean value
        System.out.printf("Reader %s have delayed books%n", reader.toString());
    }
}
