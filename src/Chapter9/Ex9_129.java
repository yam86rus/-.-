package Chapter9;

//9.129. Дано ошибочно написанное слово алигортм.
//        Путем перемещения его букв получить слово алгоритм.
public class Ex9_129 {
    public static void main(String[] args) {
        String s = "алигортм";
        System.out.println(s);
        StringBuilder sb = new StringBuilder(s);
        sb.replace(2, 3, "")
                .replace(5, 5, "и");
        System.out.println(sb);
    }
}
