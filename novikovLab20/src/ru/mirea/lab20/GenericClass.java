package ru.mirea.lab20;

import java.io.Serializable;

// task 3

public class GenericClass<T extends Comparable, V extends Serializable & Animal, K> {
    private T value1;
    private V value2;
    private K value3;

    public GenericClass(T value1, V value2, K value3){
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1){
        this.value1 = value1;
    }

    public V getValue2() {
        return value2;
    }

    public void setValue2(V value2){
        this.value2 = value2;
    }
    public K getValue3() {
        return value3;
    }

    public void setValue3(K value3){
        this.value3 = value3;
    }

    public void printValues(){
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);
        System.out.println("Value 3: " + value3);
    }

    public static void main(String[] args) {
        GeneralizedClass<Integer, String, Boolean> obj = new GeneralizedClass<>(20, "I love Java!!!", true);
        obj.printValues();
    }
}

