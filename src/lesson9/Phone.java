package lesson9;

public class Phone {
    private double diagonal;
    private String model;
    private int price; //поля это переменные внутри класса, которые описывают состояние объекта

    public void setPrice(int newPrice){
        price=newPrice;
    }
    public int getPrice(){
        return price;
    }
    public void setDiagonal(double newDiagonal){
        diagonal=newDiagonal;
    }
    public double getDiagonal(){
        return diagonal;
    }
    public void setModel(String newModel){
        model=newModel;
    }
    public String getModel(){
        return model;
    }
}
