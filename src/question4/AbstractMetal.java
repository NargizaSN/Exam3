package question4;

public interface AbstractMetal {
    default String makeNoise() {
        return "звенит";
    }
}
