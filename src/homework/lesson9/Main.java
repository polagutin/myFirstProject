package homework.lesson9;

public class Main {
    public static void main(String[] args) {
        Pryamougolnik pryam = new Pryamougolnik(10,15);
//        pryam.setDlina(78);
//        pryam.setShirina(96);
//        System.out.println(pryam.getDlina());
//        System.out.println(pryam.getShirina());
        System.out.println();

        Treugolnik treugolnik = new Treugolnik();
        treugolnik.setOsnovanie(85);
        treugolnik.setLevayaStorona(97);
        treugolnik.setPravayaStorona(20);
        System.out.println(treugolnik.getOsnovanie()+" "+treugolnik.getLevayaStorona()+" "+treugolnik.getPravayaStorona());

        Kvadrat kvadrat = new Kvadrat();
        kvadrat.setStorona(14);
        System.out.println(kvadrat.getStorona());

        Krug krug = new Krug();
        krug.setRadius(25);
        System.out.println(krug.getRadius());


    }

}
