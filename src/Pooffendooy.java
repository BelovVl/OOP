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

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
}
