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

    @Test
    public void addingBigNumbers() {
        double result = Calculator.calculate(2478632, '+', 3968741);
        Assertions.assertEquals(6447373, result);
    }

    @Test
    public void subtractingBigNumbers() {
        double result = Calculator.calculate(2478632, '-', 3968741);
        Assertions.assertEquals(-1490109, result);
    }

    @Test
    public void multiplicationBigNumbers() {
        double result = Calculator.calculate(2478632, '*', 3968741);
        Assertions.assertEquals(9.837048442312e12, result);
    }

    @Test
    public void divisionBigNumbers() {
        double result = Calculator.calculate(2478632, '/', 3968741);
        double roundedResult = Precision.round(result, 3);
        Assertions.assertEquals(0.625, roundedResult);
    }

    @Test
    public void addingZeroToZero() {
        double result = Calculator.calculate(0, '+', 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void subtractingZeroToZero() {
        double result = Calculator.calculate(0, '-', 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void multiplicationZeroToZero() {
        double result = Calculator.calculate(0, '*', 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void multiplicationNumbersPerSymbol() {
        double result = Calculator.calculate(2, '*', '2');
        Assertions.assertEquals(100, result);
    }

    @Test
    public void subtractingNumbersPerSymbol() {
        double result = Calculator.calculate(10, '-', '2');
        Assertions.assertEquals(-40, result);
    }

    @Test
    public void addingNumbersPerSymbol() {
        double result = Calculator.calculate(10, '+', '2');
        Assertions.assertEquals(60, result);
    }

    @Test
    public void divisionNumbersPerSymbol() {
        double result = Calculator.calculate(100, '/', '2');
        Assertions.assertEquals(2, result);
    }

    @Test
    public void multiplicationSymbolPerSymbol() {
        double result = Calculator.calculate('c', '*', 'a');
        Assertions.assertEquals(9603, result);
    }

    @Test
    public void subtractingSymbolPerSymbol() {
        double result = Calculator.calculate('c', '-', '2');
        Assertions.assertEquals(49, result);
    }

    @Test
    public void addingSymbolPerSymbol() {
        double result = Calculator.calculate('c', '+', 'a');
        Assertions.assertEquals(196, result);
    }

    @Test
    public void divisionSymbolPerSymbol() {
        double result = Calculator.calculate('c', '/', 'a');
        double roundedResult = Precision.round(result, 1);
        Assertions.assertEquals(1, roundedResult);
    }
}