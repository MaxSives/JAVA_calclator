public class CalculatorOperation{
    public static void main(String[] args) {

        double result = Calculator.addition(2,2);
        System.out.println(result);

        double result2 = Calculator.division(2,0);
        System.out.println(result2);

        double result3 = Calculator.exponentiation(2,8);
        System.out.println(result3);

        double result4 = Calculator.remainderOfTheDivision(126,37);
        System.out.println(result4);
    }
}
