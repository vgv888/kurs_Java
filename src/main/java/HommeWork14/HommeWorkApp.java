package HommeWork14;

import java.util.ArrayList;
import java.util.Collections;

public class HommeWorkApp {
    public static Integer[] convertArray(Integer... intArray) {
        if (intArray == null || intArray.length == 0) throw new RuntimeException("Заполните массив");

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, intArray);
        if (!list.contains(4)) throw new RuntimeException("Массив должен содержать 4");

        int lastIndex4 = list.lastIndexOf(4);
        return list.subList(lastIndex4 + 1, list.size()).toArray(Integer[]::new);
    }

    public static boolean checkArray(Integer... intArray) {
        if (intArray == null || intArray.length == 0) return false;

        boolean matchOne = false;
        boolean matchFour = false;
        for (Integer integer : intArray) {
            if (integer == 1) matchOne = true;
            else if (integer == 4) matchFour = true;
            else return false;
        }
        return matchOne & matchFour;
    }
}
