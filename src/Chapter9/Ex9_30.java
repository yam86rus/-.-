package Chapter9;

//9.30. Из слова апельсин путем "вырезок" и "склеек" его букв получить слово спаниель.
public class Ex9_30 {
    public static void main(String[] args) {
        String string = "апельсин";
        String string2 = "" + string.charAt(5) + string.charAt(1) + string.charAt(0) + string.charAt(7) + string.charAt(6) + string.substring(2, 5);
        System.out.println(string2);
    }
}
