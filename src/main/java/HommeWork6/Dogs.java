package HommeWork6;

public class Dogs extends Animals {
    private static final String baest = "Собака";
    final int dogsRun = 500;
    final int dogsSwim = 10;

    public Dogs(String name, int run, int swim) {
        super(name, run, swim, baest);
        if(run > dogsRun && swim > dogsSwim){
            System.out.printf("%s %s не сможет пробежать, он устанет, и может утануть, %s большое растояние для пса",baest,name,dogsSwim);
        }else System.out.printf("%s %s пробежвл %d, и проплыл %s",baest,name,getRun(), getSwim());
        {
            System.out.println();
        }

    }
}

