package Chapter9;

import java.util.Scanner;

//9.134. Дано слово. Переставить его последнюю букву на место k-й.
//        При этом k-ю, (k + 1)-ю, ..., предпоследнюю буквы сдвинуть вправо на одну позицию.
public class Ex9_134 {
    public static void main(String[] args) {
        String s = "Ходатайствовать";
        System.out.println("Укажите номер, на которую будет сдвинута буква \"" + s.charAt(s.length() - 1) + "\"");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String s1 = s.substring(0, a-1) + s.charAt(s.length()-1) + s.substring(a-1, s.length()-1);
        System.out.println(s);
        System.out.println(s1);
    }
}
