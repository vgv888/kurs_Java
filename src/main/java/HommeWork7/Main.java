package HommeWork7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.printInfo();

        Cat Myrzik = new Cat("Мурзик", 5);
        Cat Barsik = new Cat("Барсик", 8);
        Cat Dron = new Cat("Дрон", 20);
        Cat Kapuha = new Cat("Капуха", 12);

        Cat cats[] = new Cat[]{Myrzik, Barsik, Dron, Kapuha};

        while (plate.getFood() > 0) {
            for (Cat cat : cats) {
                cat.setSatiety(false);
            }
            System.out.println("ОБЕД!!!!");

            plate.addingFood(15);

            for (Cat cat : cats) {
                cat.eat(plate);
                plate.printInfo();
            }
            System.out.println("Коты поели");
        }
    }
}

