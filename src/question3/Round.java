package question3;

public class Round extends Figure{
    private String name;
    private int quantity;

    public Round() {
    }

    public Round(String shape, int quantity) {
        this.name = shape;
        this.quantity = quantity;
    }

    public String toString() {
        return "Figure: " + this.name +
                ", quantity: " + this.quantity;
    }
}
