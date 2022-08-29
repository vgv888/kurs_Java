package HommeWork12;

import java.util.Arrays;

public class Main {

    private static final int SIZE = 10_000_000;
    private static final int SIZE_CHECK = 10;
    private static final int HALF = SIZE / 2;
    private static final int HALF_CHECK = SIZE_CHECK / 2;

    public static void main(String[] args) {
        array1();
        array2();
        array1check();
        array2check();
    }

    private static void array1() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = calculate(arr[i], i);
        }

        System.out.println(System.currentTimeMillis() - a);
    }

    private static void array2() {
        float[] arr = new float[SIZE];
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < HALF; i++) {
                a1[i] = calculate(a1[i], i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < HALF; i++) {
                a2[i] = calculate(a2[i], HALF + i);
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        float[] arrResult = new float[SIZE];

        System.arraycopy(a1, 0, arrResult, 0, HALF);
        System.arraycopy(a2, 0, arrResult, HALF, HALF);

        System.out.println(System.currentTimeMillis() - a);
    }

    private static void array1check() {
        float[] arr = new float[SIZE_CHECK];
        for (int i = 0; i < SIZE_CHECK; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE_CHECK; i++) {
            arr[i] = calculate(arr[i], i);
        }
        System.out.println(Arrays.toString(arr));

    }


    private static void array2check() {
        float[] arr = new float[SIZE_CHECK];
        float[] a1 = new float[HALF_CHECK];
        float[] a2 = new float[HALF_CHECK];
        for (int i = 0; i < SIZE_CHECK; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, HALF_CHECK);
        System.arraycopy(arr, HALF_CHECK, a2, 0, HALF_CHECK);
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < HALF_CHECK; i++) {
                a1[i] = calculate(a1[i], i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < HALF_CHECK; i++) {
                a2[i] = calculate(a2[i], HALF_CHECK + i);
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        float[] arrResult = new float[SIZE_CHECK];

        System.arraycopy(a1, 0, arrResult, 0, HALF_CHECK);
        System.arraycopy(a2, 0, arrResult, HALF_CHECK, HALF_CHECK);

        System.out.println(Arrays.toString(arrResult));
    }

    private static float calculate(float a, int i) {
        return (float) (a * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
    }
}
//    Необходимо написать два метода, которые делают следующее:
//        1) Создают одномерный длинный массив, например:
//static final int SIZE = 10 000 000;
//static final int HALF = size / 2;
//        float[] arr = new float[size].
//        2) Заполняют этот массив единицами.
//        3) Засекают время выполнения: long a = System.currentTimeMillis().
//        4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
//        arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
//        Math.cos(0.4f + i / 2));
//        5) Проверяется время окончания метода System.currentTimeMillis().
//        6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).
//        Отличие первого метода от второго:
//        ● Первый просто бежит по массиву и вычисляет значения.
//        ● Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.
//
//        Пример деления одного массива на два:
//        ● System.arraycopy(arr, 0, a1, 0, h);
//        ● System.arraycopy(arr, h, a2, 0, h).
//        Пример обратной склейки:
//        ● System.arraycopy(a1, 0, arr, 0, h);
//        ● System.arraycopy(a2, 0, arr, h, h).
//        Примечание:
//        System.arraycopy() — копирует данные из одного массива в другой:
//        System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
//        По замерам времени:
//        Для первого метода надо считать время только на цикл расчета:
//        for (int i = 0; i < size; i++) {
//        arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
//        Math.cos(0.4f + i / 2));
//        }
//        Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.

