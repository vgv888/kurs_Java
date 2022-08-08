package HommeWork7;

public class Cat {
    private final String name;
    private final int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }
    public void setSatiety(boolean plate) {
        this.satiety = satiety;
    }
    private boolean satiety = false;

    public void eat (Plate plate){
        boolean status = plate.decreaseFood(appetite);
        if (status){
            System.out.println("Кот "+getName()+ " поел");
            satiety = true;
        }else {
            System.out.println("Кот остался "+getName() +" голодным");
        }satiety = false;

    }

    public String getName() {
        return name;
    }
}


