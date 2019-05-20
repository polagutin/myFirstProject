package homework.lesson2;

public class CycleFor2 {
    public static void main(String[] args) {
        for (int i = 500; i < 1001; i++) {
            if ((i%7==0) && (i%19==0))
                System.out.println(i);
        }
    }
}