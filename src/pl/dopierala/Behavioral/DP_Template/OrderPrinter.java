package pl.dopierala.Behavioral.DP_Template;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.AbstractCollection;

public abstract class OrderPrinter {
    public final void printOrder(Order order, String filename) throws FileNotFoundException {

        try(PrintWriter writer = new PrintWriter(filename)){
            writer.println(start());
            writer.println(formatOrderNumber(order));
            writer.println(formatItems(order));
            writer.println(formatTotal(order));
            writer.println(end());
        }
    }

    protected abstract String start();
    protected abstract String formatOrderNumber(Order order);
    protected abstract String formatItems(Order order);
    protected abstract String formatTotal(Order order);
    protected abstract String end();

}
