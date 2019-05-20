package homework.lesson3;


import java.util.Scanner;

public class Romb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы хотите посчитать площадь или периметр ромба?");
        String word = scanner.nextLine();
        if (word.equals("площадь")) {
            System.out.println("Введите длину первой диагонали");
            int diagonale1 = scanner.nextInt();
            System.out.println("Введите длину второй диагонали ромба");
            int diagonale2 = scanner.nextInt();
            System.out.println("Площадь ромба: " + (0.5 * diagonale1 * diagonale2));
        } else {
            System.out.println("Введите длину стороны ромба");
            int storona = scanner.nextInt();
            System.out.println("Периметр ромба: " + 4 * storona);
        }
    }
}
