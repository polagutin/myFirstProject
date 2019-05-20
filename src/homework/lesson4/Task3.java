package homework.lesson4;

public class Task3 {
    public static void main(String[] args) {
        String text = "I am happy to learning java";
        String text1 = text.toUpperCase();
        String text2 = text1.replace("I", "i");
        String text3 = text2.replace("A", "a");
        String text4 = text3.replace("E", "e");
        String text5 = text4.replace("O", "o");
        String text6 = text5.replace("Y", "y");


        System.out.println(text6);

    }
}
