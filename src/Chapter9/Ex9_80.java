package Chapter9;

//9.80. Дана последовательность символов, в начале которой имеется некоторое ко-личество одинаковых символов.
//        Определить это количество. Рассмотреть два случая:
//        1) известно, что не все символы последовательности одинаковые;
//        2) все символы последовательности могут быть одинаковыми.
public class Ex9_80 {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'a', 'c'};
        int count = 1;
        char findElement = chars[0];
        if (chars.length>0) {
            for (int i = 1; i <= chars.length - 1; i++) {
                if (chars[i] == chars[i-1]) {
                    count++;
                }
            }
        }
        System.out.println("Всего последовательность первых символов: " + count);

    }
}
