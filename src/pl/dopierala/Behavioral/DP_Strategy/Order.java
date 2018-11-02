package pl.dopierala.Behavioral.DP_Strategy;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Order {

    private String id;
    private LocalDate date;
    private Map<String,Double> items = new HashMap<>();
    //private double total;

    public Order(String id) {
        this.id = id;
        date=LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public void addItem(String name, Integer quantity){
        items.put(name, quantity.doubleValue());
    }

    public double getTotal(){


        return items.entrySet().stream().collect(Collectors.summingDouble(p->p.getValue()));
        //return total;
    }

}
