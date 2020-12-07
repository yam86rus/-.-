package Chapter9;
//9.127. Дано ошибочно написанное слово иинформаця.
//        Путем перемещения его букв получить слово информация.
public class Ex9_127 {
    public static void main(String[] args) {
        String s = "иинформаця";
        System.out.println(s);
        String s2 = s.substring(1,s.length()-1)+s.charAt(0)+s.charAt(s.length()-1);
        System.out.println(s2);
    }
}
