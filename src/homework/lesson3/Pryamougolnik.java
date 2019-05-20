package homework.lesson3;

import java.util.Scanner;

public class Pryamougolnik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую сторону прямоугольника");
        int storonaA = scanner.nextInt();
        System.out.println("Введите вторую сторону прямоугольника");
        int storonaB = scanner.nextInt();
        System.out.println("Нужно посчитать площадь или периметр?");
        String word = scanner.next();
        if (word.equals("площадь")) {
            System.out.println("Площадь прямоугольника: " + (storonaA * storonaB));
        } else {
            System.out.println("Периметр прямоугольнка: " + 2 * (storonaA + storonaB));
        }
    }
}
