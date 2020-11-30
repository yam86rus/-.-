package Chapter9;

//9.101. Дано слово. Поменять местами его третью и последнюю буквы.
public class Ex9_101 {
    public static void main(String[] args) {
        String s = "Поменять";
        char c1 = s.charAt(2);
        char c2 = s.charAt(s.length() - 1);
        System.out.println(s);
        String s1 = s.substring(0, 2) + c2 + s.substring(3, s.length() - 1) + c1;
        System.out.println(s1);
    }
}
