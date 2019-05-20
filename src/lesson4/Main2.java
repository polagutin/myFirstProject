package lesson4;

public class Main2 {
    public static void main(String[] args) {
        String text = "qwertyihh";
        char[] symbolsFromText = text.toCharArray();
        for (int i=0; i<symbolsFromText.length;i++){
            if ((symbolsFromText[i]=='e') || (symbolsFromText[i]=='y') || (symbolsFromText[i]=='i')){
                char result = symbolsFromText[i];
                System.out.println(result);
            }
        }
    }
}
