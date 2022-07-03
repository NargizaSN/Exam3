package question4;

public class RightPocket implements AbstractPocket, AbstractPaper, AbstractMetal {

    private AbstractPaper paper;

    public RightPocket() {
    }

    @Override
    public void add() {

    }

    public void add(AbstractPaper paper) {
        this.paper = paper;
    }

    @Override
    public String makeNoise() {
        return this.paper.makeNoise();
    }
}
