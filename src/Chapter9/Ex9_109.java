package Chapter9;

import org.w3c.dom.ls.LSOutput;

//9.109. Дано слово.
//        а) Удалить из него третью букву.
//        б) Удалить из него k-ю букву.
public class Ex9_109 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Удалить");
        System.out.println(sb.replace(2,3,"")+"_");
    }
}
