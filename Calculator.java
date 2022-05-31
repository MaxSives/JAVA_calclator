public class Calculator {
    public static void main(String[] args) {

        System.out.println(Operation.addition(10, 5));
        System.out.println(Operation.subtraction(10, 5));
        System.out.println(Operation.multiplication(10, 5));
        System.out.println(Operation.division(10, 5));
        System.out.println(Operation.division(10, 0));
        System.out.println(Operation.remainderOfTheDivision(11, 5));
        System.out.println(Operation.exponentiation(2, 3));
        System.out.println(Operation.addition(100, 100));

    }

        class Operation {
            private static double addition (double num1, double num2) {
                 return num1 + num2;
        }

            private static double subtraction (double num1, double num2) {
                return num1 - num2;
        }

            private static double multiplication (double num1, double num2) {
                return num1 * num2;
        }

            private static double division (double num1, double num2) {
                if (num2 == 0)
                    return 0;
                else 
                    return num1 / num2;
        }
    
            private static double remainderOfTheDivision (double num1, double num2) {
                return num1 % num2;
        }

            private static double exponentiation (double num1, double num2) {
                return Math.pow(num1, num2);
        }
    }
}
