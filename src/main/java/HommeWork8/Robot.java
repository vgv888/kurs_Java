package HommeWork8;

public class Robot implements Aсtion {
   public final int MAX_JUMP = 3;
   public final int MAX_RUN = 10000;
       public String name;


    public Robot(String name) {
        this.name = name;
    }

    @Override
    public boolean jump(int height) {
        if (MAX_JUMP >= height){
            System.out.println(name + " не сможет прыгнуть на такую высоту");
            return false;
        }else {
            System.out.println(name + " может прыгнуть "+height+" метров");
            return true;
        }
    }

    @Override
    public boolean run(int longline) {
        if (MAX_RUN >= longline){
            System.out.println(name + " не пробежит такое расстояние");
            return false;
        }else {
            System.out.println(name + " может пробежать "+longline+" метров");
            return true;
        }
    }

    @Override
    public boolean overcome(Obstacle obstacle) {
        return false;
    }
}


//1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти
//        классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в
//        консоль).
//        2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//        должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//        печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//        3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
//        этот набор препятствий.
//        4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
//        на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он
//        препятствий не идет.

