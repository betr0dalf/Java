package ru.mirea.lab30;

public class InternetOrder extends ListNode {
    private Node head;
    private int size;

    public InternetOrder() {
        this.head = null;
        this.size = 0;
    }

    public InternetOrder(Item[] items) {
        for (Item item : items) {
            add(item);
        }
    }

    public boolean add(Item item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.previous = head;
        } else {
            Node lastNode = head.previous;
            newNode.next = head;
            newNode.previous = lastNode;
            lastNode.next = newNode;
            head.previous = newNode;
        }
        size++;
        return true;
    }

    // Внутренний класс для представления узла списка
    private class Node {
        private Item item;
        private Node next;
        private Node previous;

        public Node(Item item) {
            this.item = item;
            this.next = null;
            this.previous = null;
        }
    }
}

