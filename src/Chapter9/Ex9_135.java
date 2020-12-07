package Chapter9;

//9.135. Дано ошибочно написанное слово килбайот.
//        Путем перемещения его букв получить слово килобайт.
public class Ex9_135 {
    public static void main(String[] args) {
        String s = "килбайот";
        System.out.println(s);
        String s1 = s.substring(0, 3)+ s.charAt(s.length()-2)+s.substring(3,6)+s.charAt(s.length()-1);
        System.out.println(s1);
    }
}
