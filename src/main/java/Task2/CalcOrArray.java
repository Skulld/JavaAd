package Task2; /** @author Museiko Xenia*/

import java.util.Scanner;

public class CalcOrArray
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Для работы с массивами введите 1, для режима калькулятора введите 2: ");
        byte switcher = sc.nextByte();
        if (switcher == 2) {
            System.out.print("\nВведите первое число: ");
            float first = sc.nextFloat();
            System.out.print("\nВведите второе число: ");
            float second = sc.nextFloat();
            System.out.print("\nВведите знак операции, которую хотите выполнить: ");
            String sign = sc.next();
            sc.close();

            switch (sign) {
                case "+":
                    System.out.printf("%n%.4f", addition(first, second));
                    break;
                case "-":
                    System.out.printf("%n%.4f", subtraction(first, second));
                    break;
                case "*":
                    System.out.printf("%n%.4f", multiplication(first, second));
                    break;
                case "/":
                    if (second == 0) {
                        System.out.print("На ноль делить нельзя");
                    } else {
                        System.out.printf("%n%.4f", division(first, second));
                    }
                    break;
                default:
                    System.out.println("Неизвестная операция.");
                    break;
            }
        }
        else if (switcher == 1){
            System.out.print("Введите длину массива: ");
            int arrayLng = sc.nextInt();
            String[] myArray = new String[arrayLng];
            int max = 0;
            String longest = "";
            for (int i = 0; i < arrayLng; i++)
            {
                System.out.printf("%n%s%d%s", "Введите ", i+1, " слово: ");
                myArray[i] = sc.next();
            }
            for (String word : myArray){
                    longest = (max < word.length()) ? word : longest;
                    max = (max < word.length()) ? word.length() : max;
                };
            if (longest != ""){
                System.out.print("\nСамое длинное слово: "+longest);
            }
            else System.out.println("Необходимо заполнять массив словами.");
        }

        else {
            System.out.println("Неизвестная функция");
        }
    }

     /**@return возвращает сумму чисел*/
    public static float addition(float x, float y) {
        return x + y;
    }
    /**@return возвращает разность чисел*/
    public static float subtraction(float x, float y) {
        return x - y;
    }
    /**@return возвращает произведение чисел*/
    public static float multiplication(float x, float y) {
        return x * y;
    }
    /**@return возвращает частное чисел*/
    public static float division(float x, float y) {
        return x / y;
    }
}