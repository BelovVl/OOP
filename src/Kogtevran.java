public class Kogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    @Override
    public String toString() {
        return "Ученик Когтеврана: " + "имя: " + getName() + ", фамилия: " + getSurname() + ", интелект: " + smart + ", мудрость: " + wise + ", остроумие: " + witty + ", творчество: " + creativity;
    }

    public Kogtevran(String surname, String name, int strong, int transgress, int smart, int wise, int witty, int creativity) {
        super(surname, name, strong, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;

    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;

    }

    public int getCreativity() {
        return creativity;

    }
}
