package Task6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        double input1 = Calculator.getOperand();
        char oper = Calculator.getOperation();
        double input2 = Calculator.getOperand();

        Expression testExpression = new Expression(input1, oper, input2);
        Double result = testExpression.calculate();
        System.out.printf("%n%.4f", result);
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

        public Double calculate() throws Exception {
            switch (operation) {
                case '+':
                    return operand1 + operand2;
                case '-':
                    return operand1 - operand2;
                case '*':
                    return operand1 * operand2;
                case '/':
                    if (operand2 == 0) {
                        throw new ArithmeticException("На ноль делить нельзя!");
                    } else {
                        return operand1 / operand2;
                    }
                default:
                    throw new Exception("L'Impossible!");
            }
        }
    }

    public static Double getOperand() {
        System.out.println("Введите число: ");
        try {
            double operand = in.nextDouble();
            return operand;
        } catch (InputMismatchException e) {
            System.out.println("Неправильный формат числа. Начните сначала - " + e);
        }
        return null;
    }

    public static char getOperation() throws Exception {
        System.out.println("Введите знак операции: ");
        char oper = in.next().charAt(0);
        if (!(Character.toString(oper).matches(("[+*/-]$")))) {
            throw new Exception("Неподходящий знак операции.");
        } else {
            return oper;
        }
    }
}