package Chapter7;

import java.util.ArrayList;
import java.util.List;

public class Ex7_FillListRandom {
    public static List<Integer> getFillList(int min, int max, int size) {
        List<Integer> integerList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            int random = min + (int) ((max - min + 1) * Math.random());
            integerList.add(random);
        }
        return integerList;
    }
}
