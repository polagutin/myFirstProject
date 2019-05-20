package homework.lesson1;

public class buy {
    public static void main(String[] args) {
        int cash = 1000, pizza = 230, gum = 26, value1, cash2, value2;
        double sweet = 2.5, sdacha, value3;
        value1=cash/pizza;
        cash2=cash-pizza*value1;
        value2=cash2/gum;
        sdacha=cash2-gum*value2;
        value3=sdacha/sweet;
        int a=(int)value3;
        int b=(int)sdacha;
        System.out.println("На эти деньги мы можем купить:");
        System.out.println("- "+value1+" пиццы");
        System.out.println("- "+value2+" жвачки");
        System.out.println("- "+a+" конфет");
        System.out.println("Сдача с магазина: "+b+" рубля.");
    }
}
