package lesson11;

public class Monkey extends ZooAnimal {
    public Monkey() {
        super();
    }

    public Monkey(int cost) {
        super(cost);
    }

    @Override
    public void voice() {
        System.out.println("Yayyayayya");
    }

    @Override
    public void jump() {
        System.out.println("Обезьяна прыгает");
    }

    @Override
    public void printInfo() {
        System.out.println("Это обезьяна со стоимостью = "+this.getCost());
    }
}
