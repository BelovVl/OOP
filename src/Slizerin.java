public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstPower;

    @Override
    public String toString() {
        return "Ученик Слизерина: " + "имя: " + getName() + ", фамилия: " + getSurname() + ", хитрость: " + cunning + ", решительность: " + determination + ", амбициозность: " + ambition + ", находчивость: " + resourcefulness + ", жажда власти: " + thirstPower;
    }

    public Slizerin(String surname, String name, int strong, int transgress, int cunning, int determination, int ambition, int resourcefulness, int thirstPower) {
        super(surname, name, strong, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }

    public int getCunning() {
        return cunning;

    }

    public int getDetermination() {
        return determination;

    }

    public int getAmbition() {
        return ambition;

    }

    public int getResourcefulness() {
        return resourcefulness;

    }

    public int getThirstPower() {
        return thirstPower;

    }
}
