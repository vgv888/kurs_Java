package HommeWork7;

import java.util.Scanner;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int foodToDecrease) {
        if (food >= foodToDecrease) {
            food -= foodToDecrease;
            return true;
        }
            System.out.println("В тарелке " + foodToDecrease + " не достаточно еды");
            return false;
        }

    public void addingFood(int foodToAdding){
        System.out.println("Положите в миску еду");
        Scanner scan = new Scanner(System.in);
        foodToAdding =scan.nextInt();
        food +=foodToAdding;
        System.out.println("В миску добавили "+foodToAdding+" еды");
    }
    public int getFood() {
        return food;
    }
        public void printInfo() {
            System.out.println("В тарелке осталось " + food + " еды");

        }
    }

//    System.out.print("Введите любое целое число от 1 до 10: ");
//            Scanner scan = new Scanner(System.in);
//            int number = scan.nextInt();
//            System.out.println ("Вы ввели число " + number);






























//    private int food;
//
//    public Plate(int food) {
//        this.food = food;
//    }
//
//    public void decreaseFood(int foodToDecrease){
//        food -= foodToDecrease;
//    }
//
//    public int getFood() {
//        return food;
//    }
//    public void printInfo(){
//        System.out.println("в тарелке осталось "+ food +" еды");
//    }