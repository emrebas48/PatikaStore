package PatikaStore;
import java.lang.*;
import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        managementPanel MP = new managementPanel();
        Brand bra = new Brand();


        int operation= 100;

        while (operation != 0) {
            System.out.println("\nPatikaStore Product Management Panel !");
            System.out.println("  1 - Notebook Transactions");
            System.out.println("  2 - Mobile Phone Transactions");
            System.out.println("  3 - List Brand");
            System.out.println("  0 - Sign Out");
            operation = scanner.nextInt();
            System.out.println("Your choice:"+ operation);
            switch (operation) {

                case 1:  // Notebook Transactions
                    System.out.println("0- Exit");
                    System.out.println("1- List All Notebooks");
                    System.out.println("2- Add a notebook");
                    System.out.println("3- Remove a notebook with id");
                    System.out.println("4- Filter product id");
                    System.out.println("5- Filter product brand");


                    operation= scanner.nextInt();
                    if (operation==0) break;
                    else if (operation ==1){                 //List All Notebooks
                        MP.printNotebook();
                    } else if (operation==2){                 //Add a notebook
                        System.out.print("Product Id : ");
                        int productId=scanner.nextInt();
                        System.out.print("Product Name : ");
                        String productName=scanner.next();
                        System.out.print("Product Price : ");
                        float price= scanner.nextFloat();
                        System.out.print("Product Discount %: ");
                        int discount= scanner.nextInt();
                        System.out.print("Product Stock : ");
                        int stock= scanner.nextInt();
                        System.out.print("Product Brand : ");
                        String brand=scanner.next();
                        System.out.print("Product Storage : ");
                        int storage=scanner.nextInt();
                        System.out.print("Product Inch : ");
                        float screenSize= scanner.nextFloat();
                        System.out.print("Product Ram : ");
                        int ram=scanner.nextInt();
                        MP.addNotebook(new Notebook(productId,productName,price,discount,stock,brand,storage,screenSize,ram));

                    } else if (operation==3) {            //Remove a notebook with id
                        System.out.println("Remove a notebook with id: ");
                        int id = scanner.nextInt();
                        MP.removeNotebook(id);
                        System.out.println("Delete successfull!");
                    } else if (operation==4) {
                        System.out.println("FIltered Notebook by id: ");
                        int id = scanner.nextInt();
                        MP.FilterByIdNotebook(id);
                    } else if (operation==5) {
                        System.out.println("Filtered Notebooks by brand: ");
                        String brand = scanner.next();
                        MP.FilterByBrandNotebook(brand);
                    }

                    break;

                case 2:  //Mobile Phone Transactions
                    System.out.println("0- Exit");
                    System.out.println("1- List All Mobile Phones");
                    System.out.println("2- Add a Mobile Phone");
                    System.out.println("3- Remove a Mobile Phone with id");
                    System.out.println("4- Filter product id");
                    System.out.println("5- Filter product brand");
                    operation = scanner.nextInt();
                    if(operation==0) break;
                    else if (operation==1) {                    //List All Mobile Phones
                        MP.printMobilePhone();
                    } else if (operation==2) {                  //Add a Mobile Phone
                        System.out.print("Product Id : ");
                        int productId=scanner.nextInt();
                        System.out.print("Product Name : ");
                        String productName=scanner.next();
                        System.out.print("Product Price : ");
                        float price= scanner.nextFloat();
                        System.out.print("Product Discount %: ");
                        int discount= scanner.nextInt();
                        System.out.print("Product Stock : ");
                        int stock= scanner.nextInt();
                        System.out.print("Product Brand : ");
                        String brand=scanner.next();
                        System.out.print("Product Storage : ");
                        int storage=scanner.nextInt();
                        System.out.print("Product Inch : ");
                        float screenSize= scanner.nextFloat();
                        System.out.print("Product Ram : ");
                        int ram=scanner.nextInt();
                        System.out.println("Product Battery : ");
                        int battery=scanner.nextInt();
                        System.out.println("Product Color : ");
                        String color=scanner.next();
                        MP.addMobilePhone(new MobilePhone(productId,productName,price,discount,stock,brand,storage,screenSize,ram,battery,color));
                    } else if (operation==3) {          //Remove a Mobile Phone with id
                        System.out.println("Remove a Mobile Phone with id: ");
                        int id = scanner.nextInt();
                        MP.removeMobilePhone(id);
                    } else if (operation==4) {
                        System.out.println("Filtered Mobile Phone by id: ");
                        int id = scanner.nextInt();
                        MP.FilterByIdMobilePhone(id);
                    } else if (operation==5) {
                        System.out.println("Filtered Mobile Phones by brand: ");
                        String brand = scanner.next();
                        MP.FilterByBrandMobilePhone(brand);
                    }

                    break;

                case 3:  //List Brand
                    bra.printAllBrand();
                break;

            }
        }
    }

}
