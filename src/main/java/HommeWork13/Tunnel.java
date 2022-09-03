package HommeWork13;

public class Tunnel extends Stage{
    public Tunnel() {
        this.lenght=80;
        this.description = " Тоннель " + lenght + " метров";
            }


    @Override
    public void go(Cars c) {
        try {
            try {
                System.out.println(c.getName() + " готовится к этапу( ждет): "+ description);
                System.out.println(c.getName() + " начал этап: "+ description);
                Thread.sleep(lenght/ c.getSpeed() * 1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                System.out.println(c.getName() + " закончил этап: " + description);
            }
            }catch (Exception e){
            e.printStackTrace();
    }
}
}
