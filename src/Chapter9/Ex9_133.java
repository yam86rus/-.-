package Chapter9;

//9.133. Дано ошибочно написанное слово ИТЕРНЕТН. Путем перемещения его
//        букв получить слово ИНТЕРНЕТ.
public class Ex9_133 {
    public static void main(String[] args) {
        String s = "ИТЕРНЕТН";
        System.out.println(s);
        String s1 = "" + s.charAt(0) + s.charAt(s.length() - 1) + s.substring(1, s.length() - 1);
        System.out.println(s1);

    }
}
