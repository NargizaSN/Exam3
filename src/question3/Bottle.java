package question3;

public class Bottle extends Figure{
    private String name;
    private int quantity;

    public Bottle() {
    }

    public Bottle(String shape, int quantity) {
        this.name = shape;
        this.quantity = quantity;
    }

    public String toString() {
        return "Figure: " + this.name +
                ", quantity: " + this.quantity;
    }
}
