package lesson9;

public class MainCat {
    public static void main(String[] args) {
        Cat murka = new Cat();
        Cat rizhik = new Cat();
        Cat gosha = new Cat();
        murka.setAge(10);
        murka.setDlinnaHvosta(1.5);
        murka.setPoroda("lisiy");
        rizhik.setAge(5);
        rizhik.setDlinnaHvosta(0.5);
        rizhik.setPoroda("lohmatiy");
        gosha.setAge(3);
        gosha.setDlinnaHvosta(0.35);
        Cat cat1 = new Cat(10,"qwerty",10.5);

    }
}
