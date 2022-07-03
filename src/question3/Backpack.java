package question3;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private String backpackName;

    public Backpack(String backpackName) {
        this.backpackName = backpackName;
    }

    private List<Figure> figures  = new ArrayList<>();

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }

    public void addFigure(Figure figure) {
        this.figures.add(figure);
    }

    public String toString() {
        return "Backpack: " + backpackName +
                ", contains : " + this.figures.toString();
    }
}
