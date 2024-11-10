public class Pooffendooy extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    @Override
    public String toString() {
        return "Ученик Пуффендуя: " + "имя: " + getName() + ", фамилия: " + getSurname() + ", трудолюбие: " + hardworking + ", верность: " + loyal + ", честность: " + honest;
    }

    public Pooffendooy(String surname, String name, int strong, int transgress, int hardworking, int loyal, int honest) {
        super(surname, name, strong, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;

    }

    public int getLoyal() {
        return loyal;

    }

    public int getHonest() {
        return honest;

    }
}
