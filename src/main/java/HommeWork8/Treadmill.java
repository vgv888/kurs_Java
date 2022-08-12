package HommeWork8;

public class Treadmill implements Obstacle {
    private int longline;

    public Treadmill(int longline) {
        this.longline = longline;
    }

    @Override
    public boolean overcome(Aсtion aсtion) {
        return false;
    }
}
