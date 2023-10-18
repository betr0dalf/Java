package ru.mirea.lab23;

public class ArrayQueue {
    private static final int MAX_SIZE = 100;
    private Object[] queue = new Object[MAX_SIZE];
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    // Предусловие: элемент не равен null
    // Постусловие: элемент добавлен в конец очереди
    public void enqueue(Object element) {
        if (size == MAX_SIZE) {
            throw new IllegalStateException("Очередь переполнена");
        }
        queue[tail] = element;
        tail = (tail + 1) % MAX_SIZE;
        size++;
    }

    // Постусловие: если очередь не пустая, возвращается первый элемент, иначе выбрасывается исключение
    public Object element() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue[head];
    }

    // Предусловие: очередь не пустая
    // Постусловие: первый элемент удален из очереди и возвращается
    public Object dequeue() {
        Object element = element();
        queue[head] = null;
        head = (head + 1) % MAX_SIZE;
        size--;
        return element;
    }

    // Постусловие: возвращается текущий размер очереди
    public int size() {
        return size;
    }

    // Постусловие: возвращается true, если очередь пустая, иначе false
    public boolean isEmpty() {
        return size == 0;
    }

    // Постусловие: очередь очищена (все элементы удалены)
    public void clear() {
        for (int i = 0; i < size; i++) {
            queue[(head + i) % MAX_SIZE] = null;
        }
        head = 0;
        tail = 0;
        size = 0;
    }
}

