package Txt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SandBox2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");

        System.out.println(list);
        list.remove(1);
        System.out.println(list);

    }
}
