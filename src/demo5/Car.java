package demo5;

public class Car {
    private String brand;
    private double price;

    public final String madeIn = "Viet Nam";


    public static String type = "Car"; // Class variable

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price>0?price:0;
    }
}
