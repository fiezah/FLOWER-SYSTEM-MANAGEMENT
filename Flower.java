/**
 * program description : To display flower details
 * programmer : fezy
 * Date : 19 February 2024
 */
public class Flower {
    private String name;
    private String color;
    private double price;
    private int quantity;

    public Flower(String name, String color, double price, int quantity) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // toString() method to display flower details
    public String toString() {
        return "Flower: " + name + ", Color: " + color + ", Price: $" + price + ", Quantity: " + quantity;
    }
}