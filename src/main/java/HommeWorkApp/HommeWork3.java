package HommeWorkApp;

import java.util.Arrays;

public class HommeWork3 {
    public static void main(String[] args) {
        oneArry();
        twoArry(100);
        threeArry();
        fourArry(4,4);
        fiveArry(10,10);
        sixArry(10);
    }

    private static void oneArry() {
        int[] arry = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] == 0) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }System.out.println();
    }

    private static void twoArry(int i) {
        int[] arry = new int[i];
        for (i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + i + 1 );
        }
        System.out.println();
    }
    private static void threeArry() {

        int[] arryThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arryThree.length; i++) {
            if(arryThree[i] < 6){
                System.out.print(" " + arryThree[i] * 6 + " ");
            }else {
                System.out.print(arryThree[i]);
            }
        }
        System.out.println();
    }

    private static void fourArry(int i, int j) {
        int[][] arry = new int[i][j];
        for (i = 0; i < arry.length; i++) {
            for (j = 0; j < arry.length; j++) {
                if (i == j) {
                    arry[i][j] = 1;
                }
                    System.out.print(" " + arry[i][j] + " ");
                }
                System.out.println();
            }
        }

        private static void fiveArry(int len, int initialValue) {
            int[] array = new int[len];
            for (int i = 0; i < len; i++) {
                array[i] = initialValue;

                System.out.print(" " + array[i]);
            }
            System.out.println();
    }
    private static void sixArry(int i) {
        int[] arry = new int[i];
        for (i = 0; i < arry.length; i++) {
            arry[i] = (int)(Math.random() * 100);
            System.out.print(" " + arry[i] + " ");
        }
        System.out.println();
        Arrays.sort(arry);
        int max = arry[arry.length - 1];
                int min = arry[0];
        for (i = 0; i < arry.length; i++) {
            if(arry[i]<arry[0]){
                min = arry[i];
            }
        }
        System.out.print(min +" "+ max);
    }

}



