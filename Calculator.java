public class Calculator {
    public static void main(String[] args) {

        System.out.println(addition(10, 5));
        System.out.println(subtraction(10, 5));
        System.out.println(multiplication(10, 5));
        System.out.println(division(10, 5));
        System.out.println(division(10, 0));
        System.out.println(remainderOfTheDivision(11, 5));
        System.out.println(exponentiation(2, 3));

    }

    static double addition (double num1, double num2) {
        return num1 + num2;
    }

    static double subtraction (double num1, double num2) {
        return num1 - num2;
    }

    static double multiplication (double num1, double num2) {
        return num1 * num2;
    }

    static double division (double num1, double num2) {
        if (num2 == 0)
            return 0;
        else 
            return num1 / num2;
    }
    
    static double remainderOfTheDivision (double num1, double num2) {
        return num1 % num2;
    }

    static double exponentiation (double num1, double num2) {
        return Math.pow(num1, num2);
    }
}
