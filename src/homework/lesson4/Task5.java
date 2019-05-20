package homework.lesson4;

public class Task5 {
    public static void main(String[] args) {
        char massive[] = {'a', 'b', 'c', 'd'};
        char massive1[] = {'q', 'w', 'e', 'r'};
        String text = "Are you ready to start studying of programming?";
        String text1 = text.replace(massive[0], massive1[0]);
        String text2 = text1.replace(massive[1], massive1[1]);
        String text3 = text2.replace(massive[2], massive1[2]);
        String text4 = text3.replace(massive[3], massive1[3]);
        String text5 = text4.replace("A", "q");
        System.out.println(text5);

    }
}
