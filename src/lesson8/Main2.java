package lesson8;

public class Main2 {
    public static void main(String[] args) {
        String[][] tours={{"Greek","15000","polupansionat","7days"},
                {"Spain","75000","hotel","14days"},
                {"France","50000","appartment","6days"},
                {"France","100000","hotel","30days"}};
        TourUnit.printToursByOneCountry(tours,"France");
        TourUnit.printVeryExpensiveTour(tours);
        TourUnit.allEveragePrice(tours);
    }
}
