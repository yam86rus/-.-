package Chapter9;

import java.util.Scanner;

//9.122. Дано слово, оканчивающееся символом "_". Вставить заданную букву после первой буквы и.
public class Ex9_122 {
    public static void main(String[] args) {
        String s = "Металлорежущий";
        System.out.println("Дано слово \"" + s + "\"");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символ для замены");
        char c = scanner.next().charAt(0);
        int a = s.indexOf('и');
        s = new StringBuffer(s).replace(a + 1, a + 1, "" + c).toString();
        System.out.println(s);
    }
}
