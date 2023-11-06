import coffee.order.CoffeeOrderBoard;
import coffee.order.Order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        orderBoard.add(new Order(4, "Tom"));
        orderBoard.add(new Order(1, "Catwoman"));
        orderBoard.add(new Order(4, "Ironman"));
        orderBoard.add(new Order(3, "Spyderman"));
        orderBoard.add(new Order(1, "Superman"));

        orderBoard.draw();
        orderBoard.deliver();
        orderBoard.draw();

        orderBoard.deliver(1);
        orderBoard.draw();
        orderBoard.deliver(5);
        orderBoard.draw();

    }
}