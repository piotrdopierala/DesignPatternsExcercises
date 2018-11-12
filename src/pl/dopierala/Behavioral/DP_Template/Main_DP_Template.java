package pl.dopierala.Behavioral.DP_Template;

import java.io.FileNotFoundException;

public class Main_DP_Template {
    public static void main(String[] args) throws FileNotFoundException {
        Order order = new Order("1001");
        order.addItem("Soda", 2.50);
        order.addItem("Sandwich", 11.95);
        order.addItem("Pizza", 15.93);

        OrderPrinter printer = new TextPrinter();
        printer.printOrder(order,"1001.txt");
    }
}
