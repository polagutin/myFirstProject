package lesson11;

public class Popugay extends ZooAnimal {
    public Popugay() {
        super();
    }

    public Popugay(int cost) {
        super(cost);
    }

    @Override
    public void voice() {
        System.out.println("Iiiiiaaaa");
    }

    @Override
    public void jump() {
        System.out.println("Попугай прыгает");
    }

    @Override
    public void printInfo() {
        System.out.println("Это попугай со стоимостью = "+this.getCost());
    }
}
