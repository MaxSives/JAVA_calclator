import java.util.Scanner;

public class CalculatorConsole {
    public static void main(String[] args) {

        double num1;
        double num2;
        double answer;
        char operator;

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /, %): ");
        operator = reader.next().charAt(0);

        switch(operator) {
            case '+': answer = num1 + num2;
            break;

            case '-': answer = num1 - num2;
            break;

            case '*': answer = num1 * num2;
            break;

            case '/': answer = num1 / num2;
            break;

            case '%': answer = num1 % num2;
            break;

            default:  System.out.printf("Error! Enter correct operator");
            return;
        }
        System.out.print("\nThe result is given as follows:" + answer);
    }
}