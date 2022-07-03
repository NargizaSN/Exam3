package question4;

public class Me extends AbstractPerson {
    private final LeftPocket leftPocket;
    private final RightPocket rightPocket;

    public Me(LeftPocket leftPocket, RightPocket rightPocket) {
        this.leftPocket = leftPocket;
        this.rightPocket = rightPocket;
    }

    @Override
    public String toString() {
        return "У меня в карманах: " +
                "левый карман содержит " + leftPocket.makeNoise() +
                ", правый карман содержит " + rightPocket.makeNoise();
    }
}
