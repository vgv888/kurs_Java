package HommeWork8;

public class Main<aсtions> {
    public static void main(String[] args) {


        Treadmill treadmill = new Treadmill(150);
        Treadmill treadmill1 = new Treadmill(200);
        Treadmill treadmill2 =new Treadmill(500);

        Wall wall = new Wall(10);
        Wall wall1 = new Wall(20);
        Wall wall2 = new Wall(15);



        Cat Ejik = new Cat("Ежик");
        Ejik.jump(1);
        Ejik.run(12);
        Cat Barsik = new Cat("Барсик");
        Barsik.jump(2);
        Barsik.run(50);
        Man Vanya = new Man("Ваня");
        Vanya.jump(1);
        Vanya.run(500);
        Man Misha = new Man("Миша");
        Misha.run(450);
        Misha.jump(2);
        Robot R2D2 = new Robot("R2D2");
        R2D2.jump(0);
        R2D2.run(1000);
        Robot A320 = new Robot("A320");
        A320.run(1200);
        A320.jump(1);


        Aсtion aсtions[] = {Ejik,Barsik,Vanya,Misha,R2D2,A320};
        Obstacle obstacles[] = {treadmill, (Obstacle) treadmill1, (Obstacle) treadmill2, (Obstacle) wall, (Obstacle) wall1, (Obstacle) wall2};



        for (Aсtion aсtion:aсtions){
            for (Obstacle obstacle:obstacles){
                if (!aсtion.overcome(obstacle)) break;
            }
        }
   }












}
