package allclasses.fokin;

import java.util.Random;

public class FokinClass {

    // Функция, выводящая текст
    public void printMessage(String message) {
        System.out.println(message);
    }

    // Функция, рассчитывающая сумму двух чисел
    public int calculateSum(int a, int b) {
        return a + b;
    }

    // Функция, генерирующая массив случайных целых чисел
    public int[] generateRandomArray(int size, int bound) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }
}
