package Task3part1;

import java.util.Random;

public class RandomArray
    {
        public static void main(String[] args)
        {
            Random random = new Random();
            int[] anArray = new int[20];
            int min = anArray[0];
            int max = anArray[0];
            int minValue = 0;
            int maxValue = 0;

            for(int i = 0; i < 20; i++){
                anArray[i] = random.nextInt(21) - 10;
            /** @param minValue - минимальное значение,
             * @param min - индекс этого элемента*/
                min = (minValue > anArray[i]) ? i : min;
                minValue = (minValue > anArray[i]) ? anArray[i] : minValue;
                /** @param maxValue - максимальное значение,
                 * @param max - индекс этого элемента*/
                max = (maxValue < anArray[i]) ? i : max;
                maxValue = (maxValue < anArray[i]) ? anArray[i] : maxValue;
            }
        System.out.print("Максимальное значение массива: "+anArray[max]+", позиция: "+max+"\nМинимальное значение массива: "+anArray[min]+", позиция: "+min);

            anArray[min] = maxValue;
            anArray[max] = minValue;

         System.out.print("\nМаксимальное значение массива: "+anArray[max]+", позиция: "+max+"\nМинимальное значение массива: "+anArray[min]+", позиция: "+min);
        }
    }

