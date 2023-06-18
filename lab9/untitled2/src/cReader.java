public class cReader extends Users implements Reader {
    private int numBooks;

    public int getNumBooks() {
        return this.numBooks;
    }

    public void setNumBooks(int num) {
        this.numBooks = num;
    }

    public cReader(String name, int dateOfBirth) {
        super(name, dateOfBirth);
    }

    @Override
    public void pickUpBooks(int num) {
        this.setNumBooks(this.getNumBooks() + num);
        System.out.printf("%s Reader  %d picked up  book(s) from the library. He now has %s%n",
                this.getName(), num, this.getNumBooks());
    }

    @Override
    public void dropOffBooks(int num) {
        this.setNumBooks(this.getNumBooks() - num);
        System.out.printf("%s returned %d book(s) in the library. He now has %s more%n",
                this.getName(), num, this.getNumBooks());
    }

    @Override
    public void takeBook() {

    }

    @Override
    public void returnBook() {

    }
}
