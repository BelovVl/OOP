public class Hogwarts {
    private String surname;
    private String name;
    private int strong;
    private int transgress;

    public Hogwarts(String surname, String name, int strong, int transgress) {
        this.surname = surname;
        this.name = name;
        this.strong = strong;
        this.transgress = transgress;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }
}
