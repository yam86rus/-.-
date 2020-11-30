package Chapter9;

//9.100. Дано слово. Поменять местами его вторую и пятую буквы.
public class Ex9_100 {
    public static void main(String[] args) {
        String s = "Поменять";
        char c1 = s.charAt(1);
        char c2 = s.charAt(4);
        System.out.println(s);
        String s1 = "" + s.charAt(0) + c2 + s.substring(2, 4) + c1 + s.substring(5);
        System.out.println(s1);
    }
}
