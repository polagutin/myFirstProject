package lesson4;



public class Main7 {
    public static void main(String[] args) {
        String text = "I am learning java";
        String text1 = text.replace("i","?");
        String text2 = text1.replace("a","?");
        String text3 = text2.replace("e","?");
        String text4 = text3.replace("I","?");

        System.out.println(text4);


    }
}
