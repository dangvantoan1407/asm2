package asm1;

public class Product {
    private int id;
    String productName;
    private int qty;
    private double price;

    public Product(int id, String productName, int qty, double price) {
        this.id = id;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void kiemTraSoLuong() {
      if( this.qty > 0) {
          System.out.println("Còn hàng");
      } else{
          System.out.println("Hết hàng");
      }
    }
}

