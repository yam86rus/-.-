package Chapter11;

import java.util.ArrayList;
import java.util.List;

public class RandomNumber {

    public static List<Integer> getRandomList(int min, int max, int count) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            resultList.add(min + (int) ((max - min + 1) * Math.random()));
        }
        return resultList;
    }
}
