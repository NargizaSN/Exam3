package question4;

public class Main {
    public static void main(String[] args) {
        LeftPocket leftPocket = new LeftPocket();
        RightPocket rightPocket = new RightPocket();

        leftPocket.add(new Coin("Монетка"));
        rightPocket.add(new Notebook("Лист бумаги"));

        Me person = new Me(leftPocket, rightPocket);

        System.out.println(person);
    }
}
