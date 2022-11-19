package PatikaStore;
import java.lang.*;

public class MobilePhone extends Product {

    private int battery;
    private String color;



    public MobilePhone(int productId, String productName, float price, int discount, int stock, String brand,
                       int storage, float screenSize, int ram,int battery, String color){
        super(productId,productName,price,discount,stock,brand,storage,screenSize,ram);
        this.battery = battery;
        this.color=color;
    }


    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String  toString(){
        return "Product ID: " + super.getProductId() + " | Product Name: " + super.getProductName() + " | Price: "
                + super.getPrice() + " TL | Discount: %" + super.getDiscount() + " | Stock: " + super.getStock()
                + " | Storage: " + super.getStorage() + " | Screen Size: " + super.getScreenSize() + "inch | Ram: "
                + super.getRam() +  "GB | Battery: " + getBattery() + " | Color: " + getColor() + " | Brand: " + super.getBrand()  ;
    }
}
