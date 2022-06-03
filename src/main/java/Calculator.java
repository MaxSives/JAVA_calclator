public class Calculator {

    public static double calculator(double a, char operation, double b) {
        double result = 0;
        switch (operation){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) return 0;
                else result = a / b;
                break;
        }
        return result;
    }
}
