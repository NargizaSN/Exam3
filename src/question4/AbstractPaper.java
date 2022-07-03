package question4;

public interface AbstractPaper {
    default String makeNoise() {
        return "бумажное";
    }
}

