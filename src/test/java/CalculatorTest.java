import org.apache.commons.math3.util.Precision;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    public void addition() {
        double result = Calculator.calculate(2, '+', 5);
        Assertions.assertEquals(7, result);
    }

    @Test
    public void additionOfNegativeNumbers() {
        double result = Calculator.calculate(-2, '+', -21);
        Assertions.assertEquals(-23, result);
    }

    @Test
    public void multiplication() {
        double result = Calculator.calculate(4, '*', 3);
        Assertions.assertEquals(12, result);
    }

    @Test
    public void division() {
        double result = Calculator.calculate(10, '/', 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void subtraction() {
        double result = Calculator.calculate(8, '-', 6);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void subtractionOfNegativeNumbers() {
        double result = Calculator.calculate(-2, '-', -4);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void divisionOnZero() {
        double result = Calculator.calculate(2, '/', 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void operationWithInvalidArithmeticSign() {
        double result = Calculator.calculate(2, 'g', 2);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void additionOfFractionalNumbers() {
        double result = Calculator.calculate(2.123, '+', 2.328);
        double roundedResult = Precision.round(result, 3);
        Assertions.assertEquals(4.451, roundedResult);
    }

    @Test
    public void subtractionOfFractionalNumbers() {
        double result = Calculator.calculate(2.123, '-', 2.328);
        double roundedResult = Precision.round(result, 3);
        Assertions.assertEquals(-0.205, roundedResult);
    }

    @Test
    public void multiplicationOfFractionalNumbers() {
        double result = Calculator.calculate(2.123, '*', 2.328);
        double roundedResult = Precision.round(result, 3);
        Assertions.assertEquals(4.942, roundedResult);
    }

    @Test
    public void divisionOfFractionalNumbers() {
        double result = Calculator.calculate(6.359, '/', 2.328);
        double roundedResult = Precision.round(result, 3);
        Assertions.assertEquals(2.732, roundedResult);
    }

    @Test
    public void multiplicationByZero() {
        double result = Calculator.calculate(6.359, '*', 0);
        Assertions.assertEquals(0, result);
    }
}