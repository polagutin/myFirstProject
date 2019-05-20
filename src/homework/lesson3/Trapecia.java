package homework.lesson3;

import java.util.Scanner;

public class Trapecia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы хотите посчитать периметр или площадь трапеции?");
        String word = scanner.nextLine();
        if (word.equals("площадь")) {
            System.out.println("Введите длину основания трапеции");
            int osnovanie = scanner.nextInt();
            System.out.println("Введите длину высоты трапеции");
            int visota = scanner.nextInt();
            System.out.println("Площадь трапеции: " + (0.5 * visota * osnovanie));
        } else {
            System.out.println("Введите первую сторону трапеции");
            int storona1 = scanner.nextInt();
            System.out.println("Введите вторую сторону трапеции");
            int storona2 = scanner.nextInt();
            System.out.println("Введите третью сторону трапеции");
            int storona3 = scanner.nextInt();
            System.out.println("Введите четвертую сторону трапеции");
            int storona4 = scanner.nextInt();
            System.out.println("Периметр трапеции: " + (storona1 + storona2 + storona3 + storona4));
        }
    }
}
