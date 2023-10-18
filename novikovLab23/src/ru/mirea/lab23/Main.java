package ru.mirea.lab23;

public class Main {
    public static void main(String[] args) {
        testArrayQueueModule();
        testArrayQueueADT();
        testArrayQueue();
    }

    private static void testArrayQueueModule() {
        System.out.println("Testing ArrayQueueModule:\n");

        ArrayQueueModule.enqueue("A");
        ArrayQueueModule.enqueue("B");
        ArrayQueueModule.enqueue("C");

        System.out.println("Size: " + ArrayQueueModule.size()); // ожидаемый результат: 3
        System.out.println("Element: " + ArrayQueueModule.element()); // ожидаемый результат: A

        System.out.println("Dequeue: " + ArrayQueueModule.dequeue()); // ожидаемый результат: A
        System.out.println("Size: " + ArrayQueueModule.size()); // ожидаемый результат: 2

        ArrayQueueModule.clear();
        System.out.println("Size: " + ArrayQueueModule.size()); // ожидаемый результат: 0
        System.out.println("Is Empty: " + ArrayQueueModule.isEmpty()); // ожидаемый результат: true
        System.out.println();
    }

    private static void testArrayQueueADT() {
        System.out.println("Testing ArrayQueueADT:\n");

        ArrayQueueADT queue = new ArrayQueueADT();

        ArrayQueueADT.enqueue(queue, "X");
        ArrayQueueADT.enqueue(queue, "Y");

        System.out.println("Size: " + ArrayQueueADT.size(queue)); // ожидаемый результат: 2
        System.out.println("Element: " + ArrayQueueADT.element(queue)); // ожидаемый результат: X

        System.out.println("Dequeue: " + ArrayQueueADT.dequeue(queue)); // ожидаемый результат: X
        System.out.println("Size: " + ArrayQueueADT.size(queue)); // ожидаемый результат: 1

        ArrayQueueADT.clear(queue);
        System.out.println("Size: " + ArrayQueueADT.size(queue)); // ожидаемый результат: 0
        System.out.println("Is Empty: " + ArrayQueueADT.isEmpty(queue)); // ожидаемый результат: true
        System.out.println();
    }

    private static void testArrayQueue() {
        System.out.println("Testing ArrayQueue:\n");

        ArrayQueue queue = new ArrayQueue();

        queue.enqueue("M");
        queue.enqueue("N");

        System.out.println("Size: " + queue.size()); // ожидаемый результат: 2
        System.out.println("Element: " + queue.element()); // ожидаемый результат: M

        System.out.println("Dequeue: " + queue.dequeue()); // ожидаемый результат: M
        System.out.println("Size: " + queue.size()); // ожидаемый результат: 1

        queue.clear();
        System.out.println("Size: " + queue.size()); // ожидаемый результат: 0
        System.out.println("Is Empty: " + queue.isEmpty()); // ожидаемый результат: true
    }
}
