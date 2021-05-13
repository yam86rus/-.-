package Chapter8;
//8.9. Оценки каждого из 18 учеников по трем предметам представлены в виде таблицы (рис. 8.1).

import java.util.Scanner;

//Составить программу, которая запрашивает каждую из оценок и затем повторяет ее (на той же строчке).
//          Задачу решить в двух вариантах:
//        1) ввод/вывод оценок осуществляется по строкам;
//        2) ввод/вывод оценок осуществляется по столбцам.
public class Ex8_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую оценку");
        int n1 = scanner.nextInt();
        System.out.println("Введите вторую оценку");
        int n2 = scanner.nextInt();
        System.out.println("Введите третью оценку");
        int n3 = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        String str1 = "у ученика следующие оценки "
                .concat(String.valueOf(n1))
                .concat(" , ")
                .concat(String.valueOf(n2))
                .concat(" , ")
                .concat(String.valueOf(n3));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println("Время вполнения: " + (endTime - startTime) + "мс");
        System.out.println(str1);


        System.out.println("/////////////////");
        System.out.println("тоже самое, но без concat");


        startTime = System.currentTimeMillis();
        System.out.println(startTime);
        System.out.println("у ученика следующие оценки " + n1 + " , " + n2 + " , " + n3);
        endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println("Время вполнения: " + (endTime - startTime) + "мс");

        System.out.println("////////////////");

        String str2 = "У ученика следующие оценки"
                .concat(System.lineSeparator())
                .concat(String.valueOf(n1))
                .concat(System.lineSeparator())
                .concat(String.valueOf(n2))
                .concat(System.lineSeparator())
                .concat(String.valueOf(n3));

        System.out.println(str2);

    }
}
