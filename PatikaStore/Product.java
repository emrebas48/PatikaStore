package PatikaStore;
import java.lang.*;

public abstract class Product {
    private int productId;
    private String productName;
    private float price;
    private int discount;
    private int stock;
    private String brand;
    private int storage;
    private float screenSize;
    private int ram;

    public Product(int productId, String productName, float price,int discount,int stock, String brand,
                   int storage, float screenSize, int ram){  //constructor
        this.productId=productId;
        this.productName=productName;
        this.price=price;
        this.discount=discount;
        this.stock=stock;
        this.brand=brand;
        this.storage = storage;
        this.screenSize=screenSize;
        this.ram=ram;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
