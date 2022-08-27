package HommeWork10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Box <T extends Fruit> {
    private List<T> fruitList = new ArrayList<>();

    public Box(T... ffruinsArray) {
        Collections.addAll(fruitList, ffruinsArray);
    }

    public void addAll(Collection<? extends T> fruits) {
        fruitList.addAll((fruits));
    }

    public double getWeght() {
        double sum = 0.0;
        for (T fruit : fruitList) {
            sum += fruit.getWeight();
        }
        return sum;
    }


        public boolean compare (Box<Orange> box){
            return box != null | getWeght() == getWeght();
        }
        public void moveTo (Box < T > anotherBox) {
            anotherBox.addAll(fruitList);
            fruitList.clear();
        }
    }


