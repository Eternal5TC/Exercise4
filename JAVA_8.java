package ITC.exercise4;

class Category {

    private int id;
    private String name;
    private String description;
    private String type;
    private boolean active;

    Category(int id, String name, String description,
             String type, boolean active) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public boolean isActive() {
        return active;
    }
}


class Product {

    private int id;
    private String name;
    private double price;
    private String brand;
    private int stock;

    // Relationship with Category
    private Category category;

    Product(int id, String name, double price,
            String brand, int stock, Category category) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.stock = stock;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public int getStock() {
        return stock;
    }

    public Category getCategory() {
        return category;
    }
}


public class JAVA_8 {

    public static void main(String[] args) {
        Category smartphone = new Category(1, "Smartphone", "Mobile phones", "Electronics", true);

        Product p1 = new Product(101, "iPhone 17",999.99, "Apple", 10,smartphone);
        Product p2 = new Product(102, "Galaxy S26", 899.99, "Samsung", 15, smartphone);
        Product p3 = new Product(103, "Pixel 10", 799.99, "Google", 8, smartphone);

        Product[] products = new Product[3];
        products[0] = p1;
        products[1] = p2;
        products[2] = p3;

        System.out.println("============== PHONE SHOP ==============");
        System.out.printf("%-5s %-8s %-15s %-12s %-8s %-15s%n",
                "No", "ID", "Name", "Brand", "Price", "Category");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < products.length; i++) {
            System.out.printf("%-5d %-8d %-15s %-12s %-8.2f %-15s%n",
                    i + 1,
                    products[i].getId(),
                    products[i].getName(),
                    products[i].getBrand(),
                    products[i].getPrice(),
                    products[i].getCategory().getName());
        }
        System.out.println("============================================================");
    }
}