package PatikaStore;
import java.util.ArrayList;
import java.lang.*;

public class managementPanel {

    private ArrayList<MobilePhone> mp = new ArrayList();
    private ArrayList<Notebook> nb = new ArrayList();
    private ArrayList<Brand> br = new ArrayList();


    public void addMobilePhone(MobilePhone m){           //add mobile phone
        mp.add(m);
    }

    public void removeMobilePhone(int productId){       //remove mobile phone
        for(int i=0;i<mp.size();i++){
            MobilePhone m1 = (MobilePhone) mp.get(i);
            if(m1.getProductId() == productId  ){
                mp.remove(i);
            }
        }
    }
    public void printMobilePhone(){                     // list mobile phones
        System.out.println("Mobile phone List");
        System.out.println("-----------------------------------------------------------------------");
        for(int i=0; i<mp.size() ; i++){
            System.out.println(mp.get(i));
        }
    }


    public void addNotebook(Notebook n){                // add notebook
        nb.add(n);
    }
    public void removeNotebook(int productId){        //remove notebook
        for(int i=0;i<nb.size();i++){
            Notebook n1 = (Notebook) nb.get(i);
            if(n1.getProductId() == productId  ){
                nb.remove(i);
            }
        }
    }
    public void printNotebook(){                     // list notebooks
        System.out.println("Notebook List");
        System.out.println("-----------------------------------------------------------------------");
        for(int i=0; i<nb.size() ; i++){
            System.out.println(nb.get(i));
        }
    }

    public void FilterByIdNotebook(int ProductId) {
        for (int i = 0; i < nb.size(); i++) {
            Notebook n1 = (Notebook) nb.get(i);
            if (n1.getProductId() == ProductId) {
                System.out.println(nb.get(i));
            }
        }
    }
    public void FilterByIdMobilePhone(int ProductId) {
        for (int j = 0; j < mp.size(); j++){
            MobilePhone m1 = (MobilePhone) mp.get(j);
            if (m1.getProductId() == ProductId) {
                System.out.println(mp.get(j));
            }
        }
    }

    public void FilterByBrandNotebook(String brand) {
        for (int i = 0; i < nb.size(); i++) {
            Notebook n1 = (Notebook) nb.get(i);
            if (n1.getBrand().equals(brand) == true) {
                System.out.println(nb.get(i));
            }
        }
    }

    public void FilterByBrandMobilePhone(String brand) {
        for (int j = 0; j < mp.size(); j++){
            MobilePhone m1 = (MobilePhone) mp.get(j);
            if (m1.getBrand().equals(brand) == true) {
                System.out.println(mp.get(j));
            }
        }
    }


    /*public void printAllNotebooks() {
        System.out.println("Notebook List");
        System.out.println("-----------------");
        String format = "|%1$-2s|%2$-20s|%3$-20s|%4$-10s|%5$-10s|%6$-20s|%7$-5s|\n";
        System.out.format(format, "ID",
                "Product Name",
                "Price",
                "Brand",
                "Storage",
                "Inch",
                "Ram");
        System.out.println();
        for (Notebook notebook : notebook) {
            System.out.format(format, notebook.getId(),
                    notebook.getName(),
                    notebook.getPrice(),
                    notebook.getBrand().getName(),
                    notebook.getStorage(),
                    notebook.getInch(),
                    notebook.getRam());
        }
    }       */




}
