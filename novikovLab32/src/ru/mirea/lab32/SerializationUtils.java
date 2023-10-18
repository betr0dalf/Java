package ru.mirea.lab32;

import java.io.*;

public class SerializationUtils {
    public static void serialize(Object obj, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(obj);
        }
    }

    public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return ois.readObject();
        }
    }
}
