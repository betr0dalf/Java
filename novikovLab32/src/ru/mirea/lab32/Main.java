package ru.mirea.lab32;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        // Заполнение полей объекта address

        OrderManager orderManager = new OrderManager();
        // Заполнение полей объекта orderManager

        try {
            SerializationUtils.serialize(address, "address.ser");
            SerializationUtils.serialize(orderManager, "orderManager.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Address deserializedAddress = (Address) SerializationUtils.deserialize("address.ser");
            System.out.println("Deserialized Address: " + deserializedAddress.getCityName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            OrderManager deserializedOrderManager = (OrderManager) SerializationUtils.deserialize("orderManager.ser");
            System.out.println("Deserialized OrderManager: " + deserializedOrderManager.getOrderSize());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

