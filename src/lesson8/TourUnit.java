package lesson8;

public class TourUnit {
    public static void printToursByOneCountry(String[][] tours, String country) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0].equals(country)) {
                System.out.println(tours[i][0] + " " + tours[i][2] + " " + tours[i][3] + " " + tours[i][1]);
            }
        }
    }

    public static void printVeryExpensiveTour(String[][] tours) {
        int maxPrice = 0;
        for (int i = 0; i < tours.length; i++) {
            int priceNum = Integer.parseInt(tours[i][1]);
            if (priceNum > maxPrice) {
                maxPrice = priceNum;
            }
        }
        System.out.println(maxPrice);
    }


    public static void allEveragePrice(String[][] tours) {
        int allCoastPrice = 0;
        for (int i = 0;i<tours.length;i++ ){
            int priceNum=Integer.parseInt(tours[i][1]);
            allCoastPrice+=priceNum;
        }
        System.out.println(allCoastPrice/tours.length);
    }
}

