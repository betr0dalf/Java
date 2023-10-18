package ru.mirea.lab32;

public interface Order{
    boolean add(Item item);
    boolean remove(String itemName);
    int removeAll(String itemName);
    int getOrderSize();
    Item[] getItems();
    double getTotalCost();
    int getQuantity(String itemName);
    String[] getItemNames();
    Item[] getSortedItemsByPrice();
    default boolean add(MenuItem item){
        return true;
    }
    default String[] itemNames(){
        String x[] = {"0"};
        return x;
    }
    default int itemQuantity(String itemName){
        return 0;
    }
    default int itemQuantity(MenuItem itemName){
        return 0;
    }
    default void sortedItemsByCostDesc(){
    }
    default int costTotal(){
        return 1000;
    }
    default Customer getCustomer(){
        Customer customer = null;
        return customer;
    }
    default void setCustomer(){
    }
}
