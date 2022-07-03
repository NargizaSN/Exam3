package question3;

public class Flat extends Figure{
    private String name;
    private int quantity;

    public Flat() {
    }

    public Flat(String shape, int quantity) {
        this.name = shape;
        this.quantity = quantity;
    }

    public String toString() {
        return "Figure: " + this.name +
                ", quantity: " + this.quantity;
    }
}
