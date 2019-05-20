package homework.lesson5;

public class CountWors {
    public static void main(String[] args) {
        String text = "ajcneun ekpxm .p;.xcekke xe;xe;2";
        char[] glasnie = "aeyuio".toCharArray();
        char[] soglasnie = "qwrtpsdfghjklzxcvbnm".toCharArray();
        int[] countGlasnie = new int[glasnie.length];
        int[] countSoglasnie = new int[soglasnie.length];
        int count=0;
        for (int i=0;i<glasnie.length;i++){
            for (int j=0;j<text.length();j++){
                if (glasnie[i]==text.charAt(j)){
                    count++;

                }
            }
            countGlasnie[i]=count;
            System.out.println(countGlasnie[i]);
        }
}
}
