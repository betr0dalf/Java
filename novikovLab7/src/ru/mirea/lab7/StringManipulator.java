package ru.mirea.lab7;

// task 5

public interface StringManipulator {
    int countCharacters(String s);
    String getOddCharacters(String s);
    String reverseString(String s);
}

class StringManipulatorImpl implements StringManipulator {
    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String getOddCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
