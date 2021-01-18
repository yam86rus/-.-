package Chapter11;

import java.util.ArrayList;
import java.util.List;

//11.66. В массиве хранятся сведения об оценках 25 учеников по химии.
//        Определить количество неуспевающих по химии учеников.
public class Ex11_66 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(3);
        System.out.println((int) list.stream().filter(e -> e <= 3).count());
    }
}
