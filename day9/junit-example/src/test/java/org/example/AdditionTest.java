package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AdditionTest {

    @Test
    public void testAdd() {
        // arrange
        int x = 9;
        int y = 10;
        int expected = 19;
        Addition addition = new Addition();

        // act
        int actual = addition.add(x, y);

        // assert
        assertEquals(expected, actual);
    }

    @Test
    public void testDivideByZero() {
        // arrange
        int x = 9;
        int y = 0;
        Addition addition = new Addition();

        // act & assert
        assertThrows(ArithmeticException.class, () -> addition.divide(x, y));
    }

    @Test
    public void testGetNumbers() {
        // arrange
        Addition addition = new Addition();
        List<Integer> expectedNrs = new ArrayList<>();
        expectedNrs.addAll(List.of(1, 2, 3, 4));

        // arrange and act
        List<Integer> actualNrs = addition.getNumbers();

        // assert
        assertThat(actualNrs, equalTo(expectedNrs));

    }
}
