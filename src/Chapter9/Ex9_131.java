package Chapter9;

//9.131. Дано ошибочно написанное слово роцессорп.
//        Путем перемещения его букв получить слово процессор.
public class Ex9_131 {
    public static void main(String[] args) {
        String s = "роцессорп";
        String s1 = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
        System.out.println(s1);
    }
}
