import javax.print.PrintService;

public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindor = {
                new Griffindor("Поттер", "Гарри", 10, 20, 30, 40, 50),
                new Griffindor("Грейнджер", "Гермиона", 20, 30, 40, 50, 60),
                new Griffindor("Уизли", "Рон", 30, 40, 50, 60, 70),
        };
        Slizerin[] slizerins = {
                new Slizerin("Малфой", "Драко", 40, 50, 60, 70, 80, 90, 100),
                new Slizerin("Монтегю","Грэхэм",50,60,70,80,90,100,10),
                new Slizerin("Гойл","Грегори",60,70,80,90,100,10,20),
        };
        Pooffendooy[]pooffendooys={
          new Pooffendooy("Смит","Захария",70,80,90,100,10),
          new Pooffendooy("Диггори","Седрик",80,90,100,10,20),
          new Pooffendooy("Финч-Флетчли","Джастин",90,100,10,20,30),
        };
        Kogtevran[]kogtevrans={
                new Kogtevran("Чанг","Чжоу",100,10,20,30,40,50),
                new Kogtevran("Патил","Падма",10,20,30,40,50,60),
                new Kogtevran("Белби","Маркус",20,30,40,50,60,70),
        };

        PrintService.print(griffindor);
        PrintService.print(slizerins);
        PrintService.print(pooffendooys);
        PrintService.print(kogtevrans);

        topGriffindor(griffindor[0],griffindor[2]);
        topSlizerin(slizerins[1],slizerins[2]);
        topPooffendooy(pooffendooys[0],pooffendooys[2]);
        topKogtevran(kogtevrans[2],kogtevrans[0]);

        topStudent(griffindor[1],slizerins[2]);

    }
    public static void topSlizerin(Slizerin st1,Slizerin st2){
        int student1=st1.getHonor()+st1.getBravery()+st1.getNobility();
    }
}