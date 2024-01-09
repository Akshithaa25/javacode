import java.util.ArrayList;
import java.util.HashSet;

class Customer {
    private String customerId;
    private String name;
    private String email;
    private String address;
    private ArrayList<String> productIds;

    public Customer(String customerId, String name, String email, String address) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.productIds = new ArrayList<>();
    }

    public ArrayList<String> getProductIds() {
        return null;
    }

    public String getCustomerId() {
        return null;
    }

    // Getters and setters for the class properties
}

class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return null;
    }

    // Getters and setters for the class properties
}

class Order {
    private String id;
    private String customerId;
    private ArrayList<String> productIds;

    public Order(String id, String customerId, ArrayList<String> productIds) {
        this.id = id;
        this.customerId = customerId;
        this.productIds = productIds;
    }

    public String getProductIds() {
        return null;
    }

    public String getCustomerId() {
        return null;
    }

    public String getId() {
        return null;
    }

    // Getters and setters for the class properties
}

 class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("C01", "Akshi", "aksh@gmail.com", "123 Main St");
        Customer customer2 = new Customer("C02", "vardhini", "vardhini@gmail.com", "456 area St");

        Product product1 = new Product("P001", "Product 1", 100.0);
        Product product2 = new Product("P002", "Product 2", 200.0);

        // Adding customers and products to their respective ArrayLists
        customer1.getProductIds().add(product1.getId());
        customer2.getProductIds().add(product2.getId());

        // Adding orders to the order ArrayList
        Order order1 = new Order("O001", customer1.getCustomerId(), customer1.getProductIds());
        Order order2 = new Order("O002", customer2.getCustomerId(), customer2.getProductIds());

        // Displaying order details
        System.out.println("Order 1 details:");
        System.out.println("Order ID: " + order1.getId());
        System.out.println("Customer ID: " + order1.getCustomerId());
        System.out.println("Product IDs: " + order1.getProductIds());

        System.out.println("\nOrder 2 details:");
        System.out.println("Order ID: " + order2.getId());
        System.out.println("Customer ID: " + order2.getCustomerId());
        System.out.println("Product IDs: " + order2.getProductIds());
    }
}