public class Griffindor extends Hogwarts {
    private int honor;
    private int nobility;
    private int bravery;

    @Override
    public String toString() {
        return "Ученик Гриффиндора: " + "имя -" + getName() + ", фамилия - " + getSurname() + ", благородство: " + honor + ", честь: " + nobility + ", храбрость: " + bravery;
    }

    public Griffindor(String surname, String name, int strong, int transgress, int honor, int nobility, int bravery) {
        super(surname, name, strong, transgress);
        this.honor = honor;
        this.nobility = nobility;
        this.bravery = bravery;
    }

    public int getHonor() {
        return honor;
    }

    public int getNobility() {
        return nobility;
    }

    public int getBravery() {
        return bravery;
    }

}
