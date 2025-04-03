import java.util.List;
import java.util.ArrayList;
class Product
{
 private String name;
 private double price;
 private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("{\"name\": \"%s\", \"price\": %.2f, \"quantity\": %d}", name, price, quantity);
    }
}
public class Storage {
    private int capacity;
    private List<Product> storage;
    private  double totalCost;

    public Storage(int capacity) {
        this.capacity = capacity;
        this.storage = new ArrayList<>();
        this.totalCost = 0;
    }
    public void addProduct(Product product) {
        if (product.getQuantity() <= this.capacity) {
            this.storage.add(product);
            this.capacity -= product.getQuantity();
            this.totalCost += product.getTotalCost();
        } else {
            System.out.println("Not enough capacity for product: " + product);
        }
    }

    public void getProducts() {
        for (Product product : storage) {
            System.out.println(product);
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
