package asm1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
    private int id;
    String customer;
    private double grandTotal;
    private String productList;
    String city;
    Scanner sc = new Scanner(System.in);

    public Cart() {

    }

    ArrayList<Cart> list = new ArrayList<>();

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

    public String getProductList() {
        return productList;
    }

    public void setProductList(String productList) {
        this.productList = productList;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public ArrayList<Cart> getList() {
        return list;
    }

    public void setList(ArrayList<Cart> list) {
        this.list = list;
    }

    public int aDD(){
        System.out.println("Nhập tên sách cần thêm ");
        productList = sc.nextLine();

         return 0;
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
