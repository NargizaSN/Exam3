package question4;

public class Notebook implements AbstractPaper {
    private final String name;

    public Notebook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String makeNoise() {
        return name + " (" + AbstractPaper.super.makeNoise() + ")";
    }
}
