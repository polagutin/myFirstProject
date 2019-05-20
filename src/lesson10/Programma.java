package lesson10;

import java.util.Scanner;

public class Programma {
    public static void main(String[] args) {
        System.out.println("Выберете фигуру:");
        System.out.println("1-треугольник");
        System.out.println("2-прямоугольник");
        System.out.println("3-круг");
        System.out.println("4-квадрат");

        Scanner scanner = new Scanner(System.in);
        String inputFigura = scanner.nextLine();

        Figura figura=null;

        if(inputFigura.equals("1")){

            System.out.println("Введите сторону А:");
            String storonaA=scanner.nextLine();

            System.out.println("Введите сторону B:");
            String storonaB=scanner.nextLine();

            System.out.println("Введите сторону C:");
            String storonaC=scanner.nextLine();

            int stA = Integer.parseInt(storonaA);
            int stB = Integer.parseInt(storonaB);
            int stC = Integer.parseInt(storonaC);


            figura = new Treugolnik(stA,stB,stC);


        }
        if (inputFigura.equals("2")){


            System.out.println("Введите сторону B:");
            String storonaB=scanner.nextLine();

            System.out.println("Введите сторону А:");
            String storonaA=scanner.nextLine();

            int stA=Integer.parseInt(storonaA);
            int stB=Integer.parseInt(storonaB);



            figura = new Pryamougolnik(stA,stB);

        }
        if (inputFigura.equals("3")){


            System.out.println("Введите радиус круга");
            String radius = scanner.nextLine();

            int rad = Integer.parseInt(radius);

            figura = new Krojok(rad);
        }
        if (inputFigura.equals("4")){


            System.out.println("Введите сторону квадрата");
            String storonaKv = scanner.nextLine();

            int stKv = Integer.parseInt(storonaKv);

            figura = new Kvadratik(stKv);
        }
        System.out.println("Периметр,площадь или длина окружности?");

        String inputAction = scanner.nextLine();
        if(inputAction.equals("периметр")){
            figura.printPerimetr();
        }else{
            figura.printPloshad();
        }

    }
}
