package HommeWork13;

public abstract class Stage {
    protected int lenght;
    protected String description;
    public String getDescription(){
        return description;
    }
    public abstract void go(Cars c);

}
