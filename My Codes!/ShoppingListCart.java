public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // getters and setters for name, price, and quantity
}

public class ShoppingCart {
    private ArrayList<Item> cart;

    public ShoppingCart() {
        cart = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        cart.add(item);
    }

    public void removeItem(int index) {
        cart.remove(index);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Item item : cart) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    // other methods as needed
}
