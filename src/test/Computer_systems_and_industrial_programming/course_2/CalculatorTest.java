package Computer_systems_and_industrial_programming.course_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addZero() {
        double calculatedAnswer = Calculator.add(2, 0);
        assertEquals(2, calculatedAnswer);
    }

    @Test
    void addNegatives() {
        double calculatedAnswer = Calculator.add(-3, -3.4, 3);
        assertEquals(-3.4, calculatedAnswer);
        assertEquals(-5, Calculator.add(-7, 2));
    }

    @Test
    void multiply() {
    }
}