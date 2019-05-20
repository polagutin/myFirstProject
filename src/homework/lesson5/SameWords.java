package homework.lesson5;

public class SameWords {
    public static void main(String[] args) {
        String text1="I love java";
        String text2="My mom love cooking";
        char[] massivText1=text1.toCharArray();
        char[] massivText2=text2.toCharArray();
        for (int i=0;i<text1.length();i++){
            for (int j=0;j<text2.length();j++){
                if (massivText1[i]==massivText2[j]){
                    System.out.println(massivText1[i]);
                }
            }
        }
    }
}
