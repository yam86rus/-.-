package Chapter9;
//9.125. Дано ошибочно написанное слово рпроцессо.
//        Путем перемещения его букв получить слово процессор.
public class Ex9_125 {
    public static void main(String[] args) {
        String s = "рпроцессо";
        // рпроцессо
        // процессор
        s = s.substring(1)+s.charAt(0);
        System.out.println(s);
    }
}
