package ru.mirea.lab23;

public class ArrayQueueADT {
    private static final int MAX_SIZE = 100;
    private Object[] queue = new Object[MAX_SIZE];
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    // Предусловие: элемент не равен null
    // Постусловие: элемент добавлен в конец очереди
    public static void enqueue(ArrayQueueADT queue, Object element) {
        if (queue.size == MAX_SIZE) {
            throw new IllegalStateException("Очередь переполнена");
        }
        queue.queue[queue.tail] = element;
        queue.tail = (queue.tail + 1) % MAX_SIZE;
        queue.size++;
    }

    // Постусловие: если очередь не пустая, возвращается первый элемент, иначе выбрасывается исключение
    public static Object element(ArrayQueueADT queue) {
        if (queue.size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue.queue[queue.head];
    }

    // Предусловие: очередь не пустая
    // Постусловие: первый элемент удален из очереди и возвращается
    public static Object dequeue(ArrayQueueADT queue) {
        Object element = element(queue);
        queue.queue[queue.head] = null;
        queue.head = (queue.head + 1) % MAX_SIZE;
        queue.size--;
        return element;
    }

    // Постусловие: возвращается текущий размер очереди
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    // Постусловие: возвращается true, если очередь пустая, иначе false
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    // Постусловие: очередь очищена (все элементы удалены)
    public static void clear(ArrayQueueADT queue) {
        for (int i = 0; i < queue.size; i++) {
            queue.queue[(queue.head + i) % MAX_SIZE] = null;
        }
        queue.head = 0;
        queue.tail = 0;
        queue.size = 0;
    }
}
