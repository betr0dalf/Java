package ru.mirea.lab24;

public class TextDocument implements IDocument {
    // Реализация методов интерфейса IDocument
    @Override
    public void open() {
        System.out.println("Открытие текстового документа");
    }

    @Override
    public void save() {
        System.out.println("Сохранение текстового документа");
    }

    // Дополнительные методы для работы с текстовым документом
    public void editText() {
        System.out.println("Редактирование текстового документа");
    }
}
