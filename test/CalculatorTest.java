import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    public Calculator calc = new Calculator();

    @org.junit.jupiter.api.Test
    void additionWithNegativeNumbers() {
        int result = calc.addition (-3, 2);
        assertEquals(-1, result);
    }

    @org.junit.jupiter.api.Test
    void addition() {
        int result = calc.addition (3, 2);
        assertEquals(5, result);
    }

    @org.junit.jupiter.api.Test
    void substraction() {
        int result = calc.substraction (3, 2);
        assertEquals(1, result);
    }

    @org.junit.jupiter.api.Test
    void dividirDiferentThan0Test() {
        int result = calc.division (6, 3);
        assertEquals(2, result);
    }

    @org.junit.jupiter.api.Test

    void dividirWith0Test() {
        int result = calc.division (6, 0);
        assertEquals(0, result);
    }

    @org.junit.jupiter.api.Test
    void multiplyTest() {
        int result = calc.multiply (2, 3);
        assertEquals(6, result);
    }

    @org.junit.jupiter.api.Test
    void esParTest() {
        boolean result = calc.esPar(4);
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void esParConNroImparTest() {
        boolean result = calc.esPar(3);
        assertFalse(result);
    }
}