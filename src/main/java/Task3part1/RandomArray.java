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
        int minPosValue = Integer.MAX_VALUE;
        int maxNegValue = Integer.MIN_VALUE;

        for(int i = 0; i < anArray.length; i++) {
            anArray[i] = random.nextInt(21) - 10;
            System.out.print(anArray[i] + " ");
            /** @param minPosValue - минимальное позитизначение,
             * @param min - индекс этого элемента*/
            if (anArray[i] > 0) {
                min = (minPosValue > anArray[i]) ? i : min;
                minPosValue = (minPosValue > anArray[i]) ? anArray[i] : minPosValue;
            } else if (anArray[i] < 0) {
                /** @param maxNegValue - максимальное отрицзначение,
                 * @param max - индекс этого элемента*/
                max = (maxNegValue < anArray[i]) ? i : max;
                maxNegValue = (maxNegValue < anArray[i]) ? anArray[i] : maxNegValue;
            }
        }
        System.out.print("\nМаксимальное негативное значение массива: "+anArray[max]+", позиция: "+max+"\nМинимальное позитивное значение массива: "+anArray[min]+", позиция: "+min+"\n");

        anArray[min] = maxNegValue;
        anArray[max] = minPosValue;

      for (int i = 0; i < anArray.length; i++){
          System.out.print(anArray[i] + " ");
       }
    }
}
