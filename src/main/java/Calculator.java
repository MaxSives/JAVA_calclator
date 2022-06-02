public class Calculator {
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
    try {
        return num1 / num2;
    } catch (ArithmeticException e) {
       e.printStackTrace();
    } return 0;
    }

    public static double remainderOfTheDivision(double num1, double num2) {
        return num1 % num2;
    }

    public static double exponentiation(double num1, double num2) {
        return Math.pow(num1, num2);
    }


}
