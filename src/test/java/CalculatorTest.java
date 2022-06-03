import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest extends Calculator {
    @Test
    public void addition() {
      double result = Calculator.calculator(2, '+', 5);
      Assertions.assertEquals(7, result);
    }
    @Test
    public void additionOfNegativeNumbers() {
        double result = Calculator.calculator(-2,'+', -21);
        Assertions.assertEquals(-23, result);
    }
    @Test
    public void multiplication() {
        double result = Calculator.calculator(4,'*', 3);
        Assertions.assertEquals(12, result);
    }
    @Test
    public void division() {
        double result = Calculator.calculator(10, '/', 2);
        Assertions.assertEquals(5, result);
    }
    @Test
    public void subtraction() {
        double result = Calculator.calculator(8, '-', 6);
        Assertions.assertEquals(2, result);
    }
    @Test
    public void subtractionOfNegativeNumbers () {
        double result = Calculator.calculator(-2, '-', -4);
        Assertions.assertEquals(2, result);
    }
    @Test
    public void divisionOnZero() {
        double result = Calculator.calculator(2, '/', 0);
        Assertions.assertEquals(0, result);
    }
}