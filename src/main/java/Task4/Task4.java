package Task4;
import java.util.Scanner;

class InputOutputManager {
    Calculator internalCalculator;
    Scanner in = new Scanner(System.in);
    Double result;

    InputOutputManager() {
        double operand1 = getOperand1();
        char operation = getOperation();
        double operand2 = getOperand2();
        internalCalculator = new Calculator(operand1, operation, operand2);
    }

     private double getOperand1() {
        System.out.println("Введите первое число: ");
        return in.nextDouble();
    }

    private double getOperand2() {
        System.out.println("Введите второе число: ");
        return in.nextDouble();
    }

    private char getOperation() {
        System.out.println("Введите знак операции");
        return in.next().charAt(0);
    }

    void commitCalculation(){
       result = internalCalculator.calculate();
        if (result!=null){
            System.out.println(result);
        }
        else {
            System.err.println(internalCalculator.getError());
        }
    }
}

class Calculator {
    private double operand1;
    private double operand2;
    private char operation;
    private String error;

    Calculator(double operand1, char operation, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
    }

    Double calculate() {
        switch (operation){
            case '+': return operand1 + operand2 ;
            case '-': return operand1 - operand2;
            case '*': return operand1 * operand2;
            case '/': if (operand2 == 0) {
                error="На ноль делить нельзя";
                return null;
            }
            else {
                return operand1 / operand2;
            }
            default: error="Неизвестная операция.";
                return null;
        }
    }
    String getError(){
        return error;
    }
}

public class Task4 {
    public static void main (String [] args) {
      InputOutputManager testInputOutputManager = new InputOutputManager();
      testInputOutputManager.commitCalculation();

    }
}
