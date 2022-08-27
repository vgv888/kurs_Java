package HommeWork10;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {


        Box<Apple> appleBox = new Box<>(
                new Apple(),
                new Apple(),
                new Apple(),
                new Apple(),
                new Apple(),
                new Apple()
        );

        Box<Orange> orangeBox = new Box<>(
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange()
        );
        Box<GoldenApple> goldenAppleBox = new Box<>(
                new GoldenApple(),
                new GoldenApple(),
                new GoldenApple(),
                new GoldenApple(),
                new GoldenApple(),
                new GoldenApple()
        );
        System.out.println(appleBox.getWeght());
        System.out.println(goldenAppleBox.getWeght());
        System.out.println(orangeBox.getWeght());


        System.out.println(appleBox.compare(orangeBox));

        int[]i = new int[]{1,2,3,4,5,6,7,8,9};
        swap(i, 2, 4);
        System.out.println(Arrays.toString(i));

    }

    public static <T> void swap(int[] arry, int firstIndex, int secondIndex){
        if(arry == null){
            throw new IllegalArgumentException();
        }
        if (firstIndex < 0 || 10 <= firstIndex){
            throw new IllegalArgumentException("Первый аргумент не корректный");
        }
        if(secondIndex < 0 || 10 <= secondIndex){
            throw new IllegalArgumentException(" Второй индекс не корректный");
        }
        if (firstIndex == secondIndex){
            return;
        }
        int temp = arry[secondIndex];
        arry[firstIndex] = arry[secondIndex];
        arry [secondIndex] = temp;
    }
}
