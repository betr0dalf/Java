package ru.mirea.lab3;


// Shell classes task 1

public class Shell {
    public static void main(String[] args) {
        // subtask 1
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf("2.718");

        // subtask 2
        String stringValue = "1.618";
        double doubleValue = Double.parseDouble(stringValue);

        // subtask 3
        double primitiveDouble = doubleObj1.doubleValue();
        float primitiveFloat = doubleObj1.floatValue();
        int primitiveInt = doubleObj1.intValue();
        long primitiveLong = doubleObj1.longValue();
        short primitiveShort = doubleObj1.shortValue();
        byte primitiveByte = doubleObj1.byteValue();

        System.out.println("Double value from string: " + doubleValue);
        System.out.println("Primitive double value: " + primitiveDouble);
        System.out.println("Primitive float value: " + primitiveFloat);
        System.out.println("Primitive int value: " + primitiveInt);
        System.out.println("Primitive long value: " + primitiveLong);
        System.out.println("Primitive short value: " + primitiveShort);
        System.out.println("Primitive byte value: " + primitiveByte);

        // subtask 4
        System.out.println("Double object 1: " + doubleObj1);
        System.out.println("Double object 2: " + doubleObj2);

        // subtask 6
        String doubleString = Double.toString(3.14);

        System.out.println("Double to string: " + doubleString);
    }
}
