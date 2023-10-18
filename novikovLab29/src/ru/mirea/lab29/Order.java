package ru.mirea.lab29;

public interface Order {
    boolean add(Item item);
    boolean remove(String itemName);
    int removeAll(String itemName);
    int getOrderSize();
    Item[] getItems();
    double getTotalCost();
    int getQuantity(String itemName);
    String[] getItemNames();
    Item[] getSortedItemsByPrice();
}
