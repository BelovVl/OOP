public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindor = {
                new Griffindor("Поттер", "Гарри", 15, 25, 35, 45, 55),
                new Griffindor("Грейнджер", "Гермиона", 20, 30, 40, 50, 60),
                new Griffindor("Уизли", "Рон", 30, 40, 50, 60, 70),
        };
        Slizerin[] slizerins = {
                new Slizerin("Малфой", "Драко", 40, 50, 60, 70, 80, 90, 100),
                new Slizerin("Монтегю", "Грэхэм", 50, 60, 70, 80, 90, 100, 10),
                new Slizerin("Гойл", "Грегори", 60, 70, 80, 90, 100, 10, 20),
        };
        Pooffendooy[] pooffendooys = {
                new Pooffendooy("Смит", "Захария", 70, 80, 90, 100, 10),
                new Pooffendooy("Диггори", "Седрик", 80, 90, 100, 10, 20),
                new Pooffendooy("Финч-Флетчли", "Джастин", 90, 100, 10, 20, 30),
        };
        Kogtevran[] kogtevrans = {
                new Kogtevran("Чанг", "Чжоу", 100, 10, 20, 30, 40, 50),
                new Kogtevran("Патил", "Падма", 10, 20, 30, 40, 50, 60),
                new Kogtevran("Белби", "Маркус", 20, 30, 40, 50, 60, 70),
        };

        PrintService.print(griffindor);
        PrintService.print(slizerins);
        PrintService.print(pooffendooys);
        PrintService.print(kogtevrans);

        topHogwarts(griffindor[0], griffindor[2]);
        topSlizerin(slizerins[1], slizerins[2]);
        topPooffendooy(pooffendooys[0], pooffendooys[2]);
        topKogtevran(kogtevrans[2], kogtevrans[0]);

        topStudent(griffindor[1], slizerins[2]);

    }

    public static void topHogwarts(Griffindor st1, Griffindor st2) {
        int student1 = st1.getHonor() + st1.getBravery() + st1.getNobility();
        int student2 = st2.getHonor() + st2.getBravery() + st2.getNobility();
        if (student1 > student2) {
            System.out.println("Студент " + st1 + " лучше чем " + st2);
        } else {
            System.out.println("Студент " + st2 + " лучше чем " + st1);
        }
        System.out.println(" ");
    }

    public static void topSlizerin(Slizerin st1, Slizerin st2) {
        int student1 = st1.getAmbition() + st1.getCunning() + st1.getResourcefulness() + st1.getDetermination() + st1.getThirstPower();
        int student2 = st2.getAmbition() + st2.getCunning() + st2.getResourcefulness() + st1.getDetermination() + st1.getThirstPower();
        if (student1 > student2) {
            System.out.println("Студент " + st1 + " лучше чем " + st2);
        } else {
            System.out.println("Студент " + st2 + " лучше чем " + st1);
        }
        System.out.println(" ");
    }

    public static void topPooffendooy(Pooffendooy st1, Pooffendooy st2) {
        int student1 = st1.getHardworking() + st1.getLoyal() + st1.getHonest();
        int student2 = st2.getHardworking() + st2.getLoyal() + st2.getHonest();
        if (student1 > student2) {
            System.out.println("Студент " + st1 + " лучше чем " + st2);
        } else {
            System.out.println("Студент " + st2 + " лучше чем " + st1);
        }
        System.out.println(" ");
    }

    public static void topKogtevran(Kogtevran st1, Kogtevran st2) {
        int student1 = st1.getSmart() + st1.getWise() + st1.getWitty() + st1.getCreativity();
        int student2 = st2.getSmart() + st2.getWise() + st2.getWitty() + st1.getCreativity();
        if (student1 > student2) {
            System.out.println("Студент " + st1 + " лучше чем " + st2);
        } else {
            System.out.println("Студент " + st2 + " лучше чем " + st1);
        }
        System.out.println(" ");
    }

    public static void topStudent(Hogwarts student1, Hogwarts student2) {
        int st1 = student1.getStrong() + student1.getTransgress();
        int st2 = student2.getStrong() + student2.getTransgress();
        if (st1 > st2) {
            System.out.println("Студент " + student1 + " лучше чем " + student2);
        } else {
            System.out.println("Студент " + student2 + " лучше чем " + student1);
        }
    }
}