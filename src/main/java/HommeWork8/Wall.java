package HommeWork8;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }



    @Override
    public boolean overcome(Aсtion aсtion) {
        return false;
    }
}
