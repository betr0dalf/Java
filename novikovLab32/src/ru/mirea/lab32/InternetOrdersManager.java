package ru.mirea.lab32;

public class InternetOrdersManager extends QueueNode {
    private QueueNode head;
    private QueueNode tail;
    private int size;

    public QueueNode getHead() {
        return head;
    }

    public void setHead(QueueNode head) {
        this.head = head;
    }

    public QueueNode getTail() {
        return tail;
    }

    public void setTail(QueueNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean add(Order order){
        System.out.println("Order added");
        return true;
    }

    public void remove(){
        System.out.println("Order removed");
    }

    public void order(){
    }
}
