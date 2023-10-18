package ru.mirea.lab30;

import java.awt.*;

public class ListNode {
    private ListNode next;
    private MenuItem value;

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public MenuItem getValue() {
        return value;
    }

    public void setValue(MenuItem value) {
        this.value = value;
    }
}
