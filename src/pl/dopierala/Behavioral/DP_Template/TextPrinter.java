package pl.dopierala.Behavioral.DP_Template;

import java.util.Map;

public class TextPrinter extends OrderPrinter {
    @Override
    protected String start() {

        return "Order Details";
    }

    @Override
    protected String formatOrderNumber(Order order) {
        return "Order number"+order.getId();
    }

    @Override
    protected String formatItems(Order order) {
        StringBuilder builder = new StringBuilder("Items\n----------------------------\n");
        for (Map.Entry<String, Double> item :
                order.getItems().entrySet()) {
            builder.append(item.getKey()+" $"+item.getValue()+"\n");
        }
        builder.append("----------------------------\n");
        return builder.toString();
    }

    @Override
    protected String formatTotal(Order order) {

        return "Total: $"+order.getTotal();
    }


    @Override
    protected String end() {

        return "";
    }
}
