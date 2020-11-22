package Chapter9;
//9.77. Дано предложение. Определить, есть ли буква а в нем.
//        В случае положительного ответа найти также порядковый номер первой из них
public class Ex9_77 {
    public static void main(String[] args) {
        String s = "Дано предложение. Определить, есть ли буква а в нем. ";
        if (s.contains("а")) {
            System.out.println(s.indexOf("а"));
        } else {
            System.out.println("Буквы \"a\" нет в этом предложении");
        }
    }
}
