package Chapter7;
//7.32. Известны оценки каждого студента из группы по двум экзаменам. Определить
//        количество студентов группы, получивших на экзамене двойку.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex7_32 {
    private int math;
    private int eng;

    public Ex7_32(int math, int eng) {
        this.math = math;
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    @Override
    public String toString() {
        return "Ex7_32{" +
                "math=" + math +
                ", eng=" + eng +
                '}';
    }

    public static void main(String[] args) {
        List<Ex7_32> students = new ArrayList<>();
        students.add(new Ex7_32(2,3));
        students.add(new Ex7_32(3,4));
        students.add(new Ex7_32(3,5));
        students.add(new Ex7_32(2,4));
        students.add(new Ex7_32(2,5));
        List<Ex7_32> newList = students.stream().filter(e->e.getEng()==2 || e.getMath()==2).collect(Collectors.toList());
        System.out.println(students);
        System.out.println(newList);
    };
}
