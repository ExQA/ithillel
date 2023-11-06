package coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private final List<Order> orders;
    private int next = 1;

    public CoffeeOrderBoard() {
        orders = new ArrayList<>();
    }

    public void add(Order order) {
        order.setOrderNumber(next);
        orders.add(order);
        next++;
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            Order delivered = orders.get(0);
            System.out.println("Deliver ing order : " + delivered.getOrderNumber() + " | "
                    + delivered.getCustomerName());
            orders.remove(0);
        } else {
            System.out.println("No orders to deliver");
        }
    }

    public void deliver(int orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.getOrderNumber() == orderNumber) {
                System.out.println("Deliver ing order " + order.getOrderNumber() + " | " + order.getCustomerName());
                orders.remove(i);
                return;
            }
        }
        System.out.println("Order with number " + orderNumber + " not found. ");
    }

    public void draw() {
        System.out.println("*********************************************************************************");
        System.out.println("Num | Name ");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + " | " + order.getCustomerName());
        }
    }
}
