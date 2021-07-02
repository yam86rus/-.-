package Chapter7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//7.30. Известен год рождения каждого человека из группы.
//        Определить число людей, родившихся до 1985 года, и число людей, родившихся после 1990 года.
public class Ex7_30 {
    int year;
    String name;

    public Ex7_30(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ex7_30{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Ex7_30> allEmployees = Stream.of(new Ex7_30(1985, "Maxim"),
                new Ex7_30(1984, "Nick"),
                new Ex7_30(1983, "Sergey")).filter(o -> o.getYear() < 1985).collect(Collectors.toList());

        System.out.println(allEmployees);
        for (Ex7_30 obj: allEmployees){
            System.out.println("Имя " + obj.getName() + " год рождения " + obj.getYear());
        }

        int[] emp = new int[3];
        emp[0]= 1985;
        emp[1]= 1984;
        emp[2]= 1983;

        System.out.println(Arrays.toString(emp));
        Arrays.stream(emp).filter(e->e<1985).peek(System.out::println).count();
    }

}
