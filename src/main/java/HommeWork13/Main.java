package HommeWork13;

import java.text.BreakIterator;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Main {

    public static final int CARS_COUNT = 6;
    public static void main(String[] args) {

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");

        Race race = new Race(new Road(60), new Tunnel(), new Road(40));

        final CountDownLatch cdl = new CountDownLatch(CARS_COUNT);
        CyclicBarrier cb = new CyclicBarrier(CARS_COUNT + 1);

                Cars[] cars = new Cars[CARS_COUNT];
                for (int i = 0; i < cars.length; i++) {
                    cars[i] = new Cars(race, 20 + (int) (Math.random() * 10), cdl,cb);
                }


                Thread[] threads = new Thread[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }
        try{
            cb.await();

        }catch (InterruptedException | BrokenBarrierException e){
            e.printStackTrace();
        }
                System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");

        try {
            cdl.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
            }
        }






//
//    Перенести приведенный ниже код (указан в методичке) в новый проект, где мы организуем гонки. Все участники должны стартовать одновременно, несмотря на разное время подготовки. В тоннель не может одновременно заехать больше половины участников (условность). Попробуйте все это синхронизировать. Первый участник, пересекший финишную черту, объявляется победителем (в момент пересечения этой самой черты). Победитель должен быть только один (ситуация с 0 или 2+ победителями недопустима). Когда все завершат гонку, нужно выдать объявление об окончании. Можно корректировать классы (в том числе конструктор машин) и добавлять объекты классов из пакета java.util.concurrent.
