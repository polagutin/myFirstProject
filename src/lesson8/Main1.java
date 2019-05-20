package lesson8;

public class Main1 {
    public static void main(String[] args) {
        int[] massiv1 = {40,78,6,55,15,34,789,856,999,345};
        int sumChiselBy5 = Methods.summaChiselBy5(massiv1);
        System.out.println(sumChiselBy5);
        int[] result = Methods.massiveWithNumber5(massiv1,'5');
        for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
        String word = Methods.getEqualChars("Main","Methods");
        System.out.println(word);
    }
}
