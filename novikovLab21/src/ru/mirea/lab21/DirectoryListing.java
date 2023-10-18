package ru.mirea.lab21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

// task 4

public class DirectoryListing {
    public static void main(String[] args) {
        String directoryPath = "X:/MIREA_3/Java/Material";

        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        List<String> fileList = new ArrayList<>();
        for (File file : files) {
            fileList.add(file.getName());
        }

        for (int i = 0; i < Math.min(5, fileList.size()); i++) {
            System.out.println(fileList.get(i));
        }
    }
}
