package question4;

public class Coin implements AbstractMetal {
    private final String name;

    public Coin(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String makeNoise() {
        return name + " (" + AbstractMetal.super.makeNoise() + ")";
    }

}
