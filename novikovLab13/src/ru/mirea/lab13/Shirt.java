package ru.mirea.lab13;

// task 4 + 25%

public class Shirt {
    private String code;
    private String description;
    private String color;
    private String size;

    public Shirt(String code, String description, String color, String size) {
        this.code = code;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Code: " + code +
                " Description: " + description +
                " Color: " + color +
                " Size: " + size;
    }

    public static void main(String[] args) {
        String[] shirts = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        Shirt[] shirtArray = new Shirt[shirts.length];

        for (int i = 0; i < shirts.length; i++) {
            String[] shirtDetails = shirts[i].split(",");
            if (shirtDetails.length == 4) {
                Shirt shirt = new Shirt(shirtDetails[0], shirtDetails[1], shirtDetails[2], shirtDetails[3]);
                shirtArray[i] = shirt;
            }
        }

        for (Shirt shirt : shirtArray) {
            System.out.println(shirt);
            System.out.println();
        }
    }
}
