public class PrintService {
    public static void print(Griffindor[] griffindor) {
        System.out.println("Список студентов факультета Гриффиндор");
        for (int i = 0; i < griffindor.length; i++) {
            Griffindor griffindor1 = griffindor[i];
            System.out.println("Ученик - " + "имя -" + griffindor1.getName() + ", фамилия - " + griffindor1.getSurname() + ", благородство: " + griffindor1.getHonor() + ", честь: " + griffindor1.getNobility() + ", храбрость: " + griffindor1.getBravery());

        }
        System.out.println(" ");
    }

    public static void print(Slizerin[] slizerins) {
        System.out.println("Список студентов факультета Слизерин");
        for (int i = 0; i < slizerins.length; i++) {
            Slizerin slizerin = slizerins[i];
            System.out.println("Ученик - " + "имя: " + slizerin.getName() + ", фамилия: " + slizerin.getSurname() + ", хитрость: " + slizerin.getCunning() + ", решительность: " + slizerin.getDetermination() + ", амбициозность: " + slizerin.getAmbition() + ", находчивость: " + slizerin.getResourcefulness() + ", жажда власти: " + slizerin.getThirstPower());

        }
        System.out.println(" ");
    }

    public static void print(Pooffendooy[] pooffendooys) {
        System.out.println("Список студентов факультета Пуффендуй");
        for (int i = 0; i < pooffendooys.length; i++) {
            Pooffendooy pooffendooy = pooffendooys[i];
            System.out.println("Ученик - " + pooffendooy.getName() + ", фамилия: " + pooffendooy.getSurname() + ", трудолюбие: " + pooffendooy.getHardworking() + ", верность: " + pooffendooy.getLoyal() + ", честность: " + pooffendooy.getHonest());

        }
        System.out.println(" ");
    }

    public static void print(Kogtevran[] kogtevrans) {
        System.out.println("Список студентов факультета Когтевран");
        for (int i = 0; i < kogtevrans.length; i++) {
            Kogtevran kogtevran = kogtevrans[i];
            System.out.println("Ученик - " + "имя: " + kogtevran.getName() + ", фамилия: " + kogtevran.getSurname() + ", интелект: " + kogtevran.getSmart() + ", мудрость: " + kogtevran.getWise() + ", остроумие: " + kogtevran.getWitty() + ", творчество: " + kogtevran.getCreativity());

        }
        System.out.println(" ");
    }
}
