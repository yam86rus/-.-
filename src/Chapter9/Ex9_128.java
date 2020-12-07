package Chapter9;

import java.util.Scanner;

//9.128. Дано слово. Переставить его первую букву на место k-й.
//        При этом вторую, третью, ..., k-ю буквы сдвинуть влево на одну позицию.
public class Ex9_128 {
    public static void main(String[] args) {
        String s = "Расточительство";
        // Расточительство
        // астРочительство n=5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер буквы. от 1 до " + s.length());
        int a = scanner.nextInt();
        String s1 = s.substring(1, a) + s.charAt(0) + s.substring(a);
        System.out.println(s1);
    }
}
