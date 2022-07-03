package question4;

public class LeftPocket implements AbstractPocket, AbstractPaper, AbstractMetal {

    private AbstractMetal metal;

    public LeftPocket() {
    }

    @Override
    public void add() {

    }

    public void add(AbstractMetal metal) {
        this.metal = metal;
    }

    @Override
    public String makeNoise() {
        return this.metal.makeNoise();
    }
}
