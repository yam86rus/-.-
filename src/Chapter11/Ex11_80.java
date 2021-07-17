package Chapter11;

import java.util.Arrays;

//11.80. Известен рост 30 учеников школы. Сколько из них имеет рост больше 170 см?
//        Можно ли сформировать баскетбольную команду (в команде долж-но быть не менее пяти человек ростом больше 170 см)?
public class Ex11_80 {
    public static void main(String[] args) {
        int[] array = {180, 176, 177, 168, 170, 182, 179, 177};
        long result = Arrays.stream(array).filter(e -> e > 170).count();
        System.out.println(result);
        System.out.println(result > 5 ? true : false);
    }
}
