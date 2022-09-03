package HommeWork13;

public class Road extends  Stage{
    public Road(int lenght) {
        this.lenght = lenght;
        this.description = " Дорога " + lenght + " метров";

    }

    @Override
    public void go(Cars c) {
        try{
            System.out.println(c.getName() + " начал этап " + description);
            Thread.sleep(lenght /c.getSpeed() * 1000);
            System.out.println(c.getName () + " закончил этап " + description);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
