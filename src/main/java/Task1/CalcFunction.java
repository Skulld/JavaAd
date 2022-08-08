package Task1; /** @author Museiko Xenia*/

import java.util.Scanner;

public class CalcFunction
{
    public static void main(String[] args){

        Scanner numbers = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float first = numbers.nextFloat();
        System.out.print("\nВведите второе число: ");
        float second = numbers.nextFloat();
        System.out.print("\nВведите знак операции, которую хотите выполнить: ");
        String sign = numbers.next();
        numbers.close();

        if (sign.equals("+")) {
            System.out.printf("%n%.4f", addition(first,second));
        }
        else if (sign.equals("-")) {
            System.out.printf("%n%.4f", subtraction(first,second));
        }
        else {
            System.out.println("Неподдерживаемая операция");
        }
    }
      /**@return возвращает сумму чисел
       * @param x первое слагаемое,
       * @param y второе слагаемое*/
        public static float addition(float x, float y) {
            return x + y;
        }
    /**@return возвращает разность чисел
     * @param x уменьшаемое ,
     * @param y вычитаемое*/
        public static float subtraction(float x, float y) {
            return x - y;
        }
    }