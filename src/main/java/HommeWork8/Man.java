package HommeWork8;


public class Man implements Aсtion {
    private final int MAX_RUN = 1500;
    private final int MAX_JUMP = 3;
    public String name;

    public Man(String name) {
            this.name = name;

    }

    @Override
    public boolean jump(int height) {
        if (height >= MAX_JUMP){
            System.out.println(name+" не сможет пригнуть на такю высоту");
            return false;
        }else {
            System.out.println(name + " может пригнуть " + height + " метров");
            return false;
        }
    }

    @Override
    public boolean run(int longline) {
        if (longline >= MAX_RUN) {
            System.out.println(name + " не сможет пробежать такое расстояние");
            return false;
        } else {
            System.out.println(name + " может пробежать " + longline + " метров");
            return true;
        }

    }

    @Override
    public boolean overcome(Obstacle obstacle) {
        return false;
    }
}
