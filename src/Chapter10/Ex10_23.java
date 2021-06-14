package Chapter10;

import java.time.LocalDate;

//10.23. Дата некоторого дня характеризуется тремя натуральными числами: g (год),
//        m (порядковый номер месяца) и n (число). По заданным g, n и m определить:
//        а) дату предыдущего дня;
//        б) дату следующего дня.
//        Функции и процедуры 115
//        Определить функцию, подсчитывающую количество дней в том или ином
//        месяце.
//        В обеих задачах рассмотреть два случая:
//        1) заданный год не является високосным;
//        2) заданный год может быть високосным (см. задачу 4.65).
public class Ex10_23 {
    public static void main(String[] args) {
        int g = 2021, m = 6, n = 14;
        LocalDate prevDay = LocalDate.of(g, m, n).minusDays(1);
        LocalDate nextDay = LocalDate.of(g, m, n).plusDays(1);
        System.out.println("Предыдущий день ".concat(String.valueOf(prevDay)));
        System.out.println("Следующий день".concat(String.valueOf(nextDay)));

    }
}
