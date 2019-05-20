package lesson10;

import lesson10.Figura;

public class Kvadratik extends Figura {
    private  int storona;

    public Kvadratik() {
    }

    public Kvadratik(int storona) {
        this.storona = storona;
    }

    public int getStorona() {
        return storona;
    }

    public void setStorona(int storona) {
        this.storona = storona;
    }

    @Override
    public void printPloshad() {
        System.out.println("Площадь квадрата: "+(storona*storona));
    }

    @Override
    public void printPerimetr() {
        System.out.println("Периметр квадрата: "+(4*storona));
    }
}
