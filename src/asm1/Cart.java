package asm1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int id;
    String customer;
    private double grandTotal;
    private ArrayList<Product> productList;
    String city;

    public Cart() {

    }

    public void aRR(){
        String[] myArray = new String[10];
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }
    public void removeProduct(Product product) {
        this.productList.remove(product);
    }

    public void tongTien(){
        double ship = 0;
        if(this.city.equals("Ha noi") || this.city.equals("TpHCM")) {
            ship = this.grandTotal * (1/100);
        } else {
            ship = this.grandTotal * (2/100);
        }
        this.grandTotal += ship;
    }

}
