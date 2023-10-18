package ru.mirea.lab32;

public class TableOrdersManager {
    private Order orders;

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }

    public void add(Order order, int tableNumber){

    }
    public void addItem(MenuItem item, int tableNumber){

    }
    public int freeTableNumber(){
        return 0;
    }
    public int[] freeTableNumbers(){
        int x[] = {0, 0, 0};
        return x;
    }
    public void getOrder(int tableNumber){
        System.out.println("Your order");
    }
    public void remove(int tableNumber){
        System.out.println("Table " + tableNumber + " removed");
    }
    public void remove(Order order){
        System.out.println("Table order: " + order + " removed");
    }
    public void removeAll(Order order){
        System.out.println("All table orders: " + order + " removed");
    }
}
