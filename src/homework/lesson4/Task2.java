package homework.lesson4;

public class Task2 {
    public static void main(String[] args) {
        String text = "I am happy to learning java";
        String[] words = text.split(" ");
        for (int i = words.length - 1; i > -1; i--) {
            System.out.println(words[i]);
        }
    }
}

