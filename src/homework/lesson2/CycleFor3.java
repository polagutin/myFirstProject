package homework.lesson2;

public class CycleFor3 {
    public static void main(String[] args) {
        int c = 0;
        for (int i = 50; i < 1001; i++) {
            if ((i % 7 == 0) && (i % 19 == 0)) {
                c += i;
            }
        }
        System.out.println(c);
    }
}