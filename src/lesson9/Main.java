package lesson9;

public class Main {
    public static void main(String[] args) {
        //модификтаор доступа это слово которое определяет область видимости
        Phone meizu = new Phone();
        Phone saomi = new Phone();

        meizu.setPrice(10000);
        saomi.setPrice(8000);

        System.out.println(meizu.getPrice());

        meizu.setDiagonal(4.7);
        saomi.setDiagonal(5.5);

        System.out.println(meizu.getDiagonal());
        System.out.println(saomi.getDiagonal());

        meizu.setModel("onetouch");
        saomi.setModel("x12");

        System.out.println(meizu.getModel());
        System.out.println(saomi.getModel());

    }
}
