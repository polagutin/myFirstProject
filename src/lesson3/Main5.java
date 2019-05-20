package lesson3;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int a = 9;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String inputName = scanner.nextLine();
        System.out.println("Привет, "+ inputName);
        System.out.println("Введите первую сторону треугольника: ");
        int storonaA = scanner.nextInt();
        System.out.println("Введите вторую сторону треугольника: ");
        int storonaB = scanner.nextInt();
        System.out.println("Введите третью сторону треугольника: ");
        int storonaC = scanner.nextInt();
        System.out.println("Площадь или периметр?");
        String action = scanner.next();
        if (action.equals("периметр")){
            System.out.println("Периметр треугольника = "+(storonaA+storonaB+storonaC));
        }else{

        }
    }
}
