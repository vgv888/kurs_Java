package HommeWork8;

public class Cat implements Aсtion {
    private final int MAX_RUN = 100;
    private final int MAX_JUMP = 2;
    private static String name;

    public Cat(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean jump(int height) {
        if (height >= MAX_JUMP) {
            System.out.println(name + " не прыгнет на такую высоту");
            return false;
        } else {
            System.out.println(name + " может прыгнуть " + height + " метров");
            return true;
        }
    }

        @Override
        public boolean run(int longline) {
            if (longline >= MAX_RUN) {
                System.out.println(name + " не пробежит такое расстояние");
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




