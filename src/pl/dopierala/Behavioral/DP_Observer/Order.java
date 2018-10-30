package pl.dopierala.Behavioral.DP_Observer;

import java.util.LinkedList;
import java.util.List;

public class Order {

    private String id;
    private int totalPrice;
    private int quantity;
    private List<OrderObserver> observers = new LinkedList<>();

    public Order(String id) {
        this.id = id;
    }

    public void attach(OrderObserver observer){
        observers.add(observer);
    }

    public void detach(OrderObserver observer){
        observers.remove(observer);

    }

    private void notifyObservers(){
        for (OrderObserver obs :
                observers) {
            obs.updated(this);
        }
    }

    public void addItem(int price){
        totalPrice+=price;
        quantity++;
        notifyObservers();
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
        notifyObservers();
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        notifyObservers();
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }
}
