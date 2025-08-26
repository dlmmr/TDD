package org.example;

public class Tdd1 {
    public static void main(String[] args) {

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static String getFirstLetter(String name) {
        return name.substring(0,1);
    }

    public static boolean isPalindrom(String text) {

        text = "java";
        String reversedText = "";

        for (int i = 0; i < text.length(); i++) {
            reversedText = text.charAt(i) + reversedText;
        }
        if (reversedText.equals(text)) {
            return true;
        } else {
            return false;
        }
    }
}




