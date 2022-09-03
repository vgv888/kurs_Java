package HommeWork13;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Cars implements Runnable{

    private static int CARS_COUTN;
   private Race race;
   private int speed;
   private String name;
   private static CyclicBarrier cb;
   private static CountDownLatch cdl;
   private static Lock lock = new ReentrantLock();
   private static String win;

   public String getName(){
       return name;
   }
   public int getSpeed(){
       return speed;

    }
    public static int getCarsCoutn(){
       return CARS_COUTN;
    }

    public Cars(Race race, int speed, CountDownLatch cdl, CyclicBarrier cb){
       this.race = race;
       this.speed = speed;
       CARS_COUTN++;
       this.name ="Участник #" + CARS_COUTN;
       Cars.cdl = cdl;
       Cars.cb = cb;

    }

    @Override
    public void run() {
       try {
           System.out.println(this.name + "готовится");
           Thread.sleep(500 + (int)(Math.random() * 800));
           System.out.println(this.name + " готов");
       }catch ( Exception e){
           e.printStackTrace();
       }
       try {
           cb.await();
       }catch (InterruptedException | BrokenBarrierException e){
           e.printStackTrace();
       }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        cdl.countDown();

        try {
            lock.lock();
            if(win == null){
                System.out.println(this.name + " победил !!!");
                win = this.name;
            }
        }finally {
            lock.unlock();
        }

    }
}
