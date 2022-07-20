package HommeWork6;

public abstract class Animals {
    protected String name;
    private int run;
    private int swim;
    private  final String baest;

    protected final int dogsRun = 500;
    protected final int catsRun = 200;
    protected final int dogsSwim = 10;


    public Animals(String name, int run, int swim, String baest) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.baest = baest;
    }







    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getRun() {return run;}

    public void setRun(int run) {this.run = run;}

    public int getSwim() {return swim;}

    public void setSwim(int swim) {this.swim = swim;}

    public String getBaest() {return baest;}


    @Override
    public String toString() {
        return String.format("%s %s пробежит %d метров", baest,name,run);

    }

    public void printInfo(){

    }
}
