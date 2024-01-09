import java.util.ArrayList;
import java.util.HashMap;

public class Customer {
    private String name;
    private String email;
    private String address;
    public Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }
    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
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

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
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

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ArrayList<String> getProductIds() 
    {
        return productIds;
    }

    public void setProductIds(ArrayList<String> productIds) {
        this.productIds = productIds;
    }
}

 class CustomerManager {
    private ArrayList<Customer> customers;
    private HashMap<String, Customer> customerMap;
    private ArrayList<Product> products;
    private HashMap<String, Product> productMap;
    private ArrayList<Order> orders;

    public CustomerManager() {
        customers = new ArrayList<>();
        customerMap = new HashMap<>();
        products = new ArrayList<>();
        productMap = new HashMap<>();
        orders = new ArrayList<>();
    }

    // Methods to add, get, and remove customers, products, and orders
    // Additional methods for processing orders, such as calculating the total cost
}