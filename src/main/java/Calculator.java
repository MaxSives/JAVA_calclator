public class Calculator {

    public static double calculate(double a, char operation, double b) {
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) return 0;
                else return a / b;
        }
        return 0;
    }
}
