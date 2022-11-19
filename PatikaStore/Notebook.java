package PatikaStore;
import java.lang.*;

public class Notebook extends Product {



    public Notebook(int productId, String productName, float price,int discount,int stock,String brand, int storage, float screenSize, int ram){
        super(productId,productName,price,discount,stock,brand,storage,screenSize,ram);
    }

    @Override
    public String  toString(){
        return "Product ID: " + super.getProductId() + " | Product Name: " + super.getProductName() + " | Price: "
                + super.getPrice() + " TL | Discount: %" + super.getDiscount() + " | Stock: " + super.getStock() +
                " | Storage: " + super.getStorage() + " | Screen Size: " + super.getScreenSize()
                + "inch | Ram: " + super.getRam() + "GB | Brand: " + super.getBrand() ;
    }

}
