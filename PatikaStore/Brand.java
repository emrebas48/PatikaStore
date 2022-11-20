package PatikaStore;

public class Brand {
    private int id;
    private String name;

    public Brand(int id, String name){              //constructor
        this.id = id;
        this.name=name;
    }

    public Brand(int id){           //constructor
         this.id=id;
    }
    public Brand(){           //constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    static TreeSet<Brand> brands=new TreeSet<>(new Comparator<Brand>() {
        @Override
        public int compare(Brand o1, Brand o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });

    /*public void listBrands(){           benim yazdigim
        System.out.println("Our Brands:");
        System.out.println("--------------");
        for(String i : )
    } */

    public void printAllBrand(){
        System.out.println("Our Brands");
        System.out.println("---------------");
        for (Brand str:brands){
            System.out.println("- "+str.name);
        }
    }

    static {

        brands.add(new Brand(1,"Samsung"));
        brands.add(new Brand(2,"Lenovo"));
        brands.add(new Brand(3,"Apple"));
        brands.add(new Brand(4,"Huawei"));
        brands.add(new Brand(5,"Casper"));
        brands.add(new Brand(6,"Asus"));
        brands.add(new Brand(7,"HP"));
        brands.add(new Brand(8,"Xiaomi"));
        brands.add(new Brand(9,"Monster"));
    }


}
