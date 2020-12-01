package Chapter9;

import java.util.Scanner;

//9.106. Дано слово из 15-ти букв. Переставить в обратном порядке буквы, располо-женные между k-й и s-й буквами
//        (т. е. с (k + 1)-й по (s – 1)-ю).
//        Значения k и s вводятся с клавиатуры, k < s.
public class Ex9_106 {
    public static void main(String[] args) {
        String str = "автографический";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Дано слово \"" + str + "\"");
        System.out.println("Введите первую цифру, с которой будет выводиться слово, в обратном порядке");
        int k = scanner.nextInt();
        if (k > str.length()) {
            System.out.println("значение не может быть больше " + str.length());
            while (k > str.length()) {
                System.out.println("Введите первую цифру, с которой будет выводиться слово, в обратном порядке");
                k = scanner.nextInt();
            }
        }
        System.out.println("Введите вторую цифру");
        int s = scanner.nextInt();
        if (s<k){
            System.out.println("Вторая цифра не может меньше первой");
            while (s<k){
                System.out.println("Введите корректное значение для второй цифры");
                s = scanner.nextInt();
            }
        }
        System.out.println("первая цирфа " + k + " вторая цирфа " + s);
        StringBuilder sb1 = new StringBuilder(str.substring(k-1,s));
        sb1 = sb1.reverse();
        System.out.println(str.substring(0,k-1)+sb1+str.substring(s));

    }
}
