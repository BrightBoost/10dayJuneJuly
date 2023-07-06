package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }

    @Order(2)
    @Test
    public void testAddWithPositiveNumbers() {
        // arrange
        int a = 12;
        int b = 4;
        int expectedResult = 16;

        // act
        int actualResult = calculator.add(a, b);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Order(1)
    @Test
    public void testAddWithNegativeNumbers() {
        // arrange
        int a = -12;
        int b = -4;
        int expectedResult = -16;

        // act
        int actualResult = calculator.add(a, b);

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Disabled("temp down due to maintenance")
    @Test
    public void testMultiplyWithPositiveNumbers() {
        // arrange
        double a = 12.23;
        double b = 4.12;
        double expectedResult = 50.3876;

        // act
        double actualResult = calculator.multiply(a, b);

        // assert
        assertEquals(expectedResult, actualResult, 0.0001);
    }


}
