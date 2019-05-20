package lesson10;

public class Krojok extends Figura {
    private int radius;

    public Krojok() {
    }

    public Krojok(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void printPloshad() {
        System.out.println("Площадь круга: "+(radius*radius*Math.PI));
    }

    @Override
    public void printPerimetr() {
        System.out.println("Длина окружности: "+(2*radius*Math.PI));
    }
}
