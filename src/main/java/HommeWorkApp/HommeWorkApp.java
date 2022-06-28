package HommeWorkApp;

public class HommeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        int a = 10;
        int b = 15;
        if((a + b) >= 0){
            System.out.println("Сумма положительная");
        }else System.out.println("Сумма отрицательная");
    }
    private static void printColor() {
        int value = 10;
        if(value <= 0){
            System.out.println("Красный");
        }else if(0 < value || value <= 100){
            System.out.println("Желтый");
        }else {
            System.out.println("Зеленый");
        }

    } private static void compareNumbers() {
        int a = -14;
        int b = 100;
        if(a >= b){
            System.out.println("a>=b");
        }else
            System.out.println("a < b");
    }
}
