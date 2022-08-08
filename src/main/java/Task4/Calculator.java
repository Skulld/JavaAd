package Task4;

import java.util.Scanner;

public class Calculator {

    static Scanner in = new Scanner(System.in);

    public static void main (String [] args) {
        double input1 = Calculator.getOperand();
        System.out.println("Введите знак: ");
        char oper = in.next().charAt(0);
        double input2 = Calculator.getOperand();

        Expression testExpression = new Expression(input1, oper , input2);
        Double result = testExpression.calculate();
        if (result!=null) {
            System.out.printf("%n%.4f", result);
        }
    }

    public static class Expression {
        Double operand1;
        Double operand2;
        char operation;

        public Expression(double operand1, char operation, double operand2) {
            this.operand1 = operand1;
            this.operand2 = operand2;
            this.operation = operation;
        }

        public Double calculate() {
            switch (operation){
                case '+': return operand1 + operand2 ;
                case '-': return operand1 - operand2;
                case '*': return operand1 * operand2;
                case '/': if (operand2 == 0) {
                    System.out.println("На ноль делить нельзя");
                    return null;
                }
                else {
                    return operand1 / operand2;
                }
                default: System.out.println("Неизвестная операция.");
                    return null;
            }
        }
    }

    public static double getOperand() {
        System.out.println("Введите число: ");
        double operand = in.nextDouble();
        return operand;
    }

}