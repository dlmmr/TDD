package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Tdd1Test {

    @Test
    void sum() {
        //Given
        int a = 5;
        int b = 7;
        int expected = a + b;
        //When
        int actual = Tdd1.sum(a,b);
        //Then
        assertEquals(actual, expected);
    }

    @Test
    void isEven() {
        //Given
        int number = 5;
        boolean expected = (number % 2 == 0);
        //When
        boolean actual = Tdd1.isEven(number);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void getFirstLetter() {
        //Given
        String name = "Olfaf";
        String expected = name.substring(0, 1);
        //When
        String actual = Tdd1.getFirstLetter(name);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void isPalindrom() {
        //Given
        String text = "java";
        boolean expected = false;
        //When
        boolean actual = Tdd1.isPalindrom(text);
        //Then
        assertEquals(expected,actual);
    }
}