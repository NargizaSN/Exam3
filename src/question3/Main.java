package question3;


import java.util.ArrayList;
import java.util.List;

public class Main {
    static ArrayList <Backpack> backpacks = new ArrayList<Backpack>();


    public static void main(String[] args) {
        Backpack backpack1 = new Backpack("backpack #1");
        Backpack backpack2 = new Backpack("backpack #2");
        Backpack backpack3 = new Backpack("backpack #3");

        backpack1.addFigure(new Round("apple", 20));
        backpack1.addFigure(new Flat("book", 1));
        backpack1.addFigure(new Bottle("coke", 1));
        backpacks.add(backpack1);

        backpack2.addFigure(new Round("tennis ball", 50));
        backpack2.addFigure(new Flat("folder", 1));
        backpack2.addFigure(new Bottle("water", 1));
        backpacks.add(backpack2);

        backpack3.addFigure(new Round("apple", 10));
        backpack3.addFigure(new Round("tennis ball", 3));
        backpack3.addFigure(new Flat("folder", 1));
        backpack3.addFigure(new Bottle("coke", 1));
        backpacks.add(backpack3);

        for (Backpack b : backpacks){
            System.out.println(b.toString());
        }
    }
}
