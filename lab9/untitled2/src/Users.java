public abstract class Users {
    private String name;
    private int dateOfBirth;

    Users(String name, int dateOfBirth) {
        this.setName(name);
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.getName();
    }
}