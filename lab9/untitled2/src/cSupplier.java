public class cSupplier extends Users implements Supplier {

    public cSupplier(String name, int dateOfBirth) {
        super(name, dateOfBirth);
    }

    @Override
    public void bringBooks() {
        System.out.printf("Supplier  brings new books%n", this.getName());
    }
}