package homework.lesson3;


import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String inputName = scanner.nextLine();
        System.out.println("Привет " + inputName);
        System.out.println("Введети радиус круга");
        int radius = scanner.nextInt();
        System.out.println("Посчитать площадь или длину окружности?");
        String krug = scanner.next();
        if (krug.equals("площадь")) {
            System.out.println("Площадь круга: " + (Math.PI * radius * radius));
        } else {
            System.out.println("Длина окружности: " + (2 * Math.PI * radius));
        }
    }
}
