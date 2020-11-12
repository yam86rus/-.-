package Chapter9;

//9.43. Дано слово s1. Получить слово s2, образованное нечетными буквами слова s1.
public class Ex9_43 {
    public static void main(String[] args) {
        String s = "Образованное", s2 = "";

        for (int i = 0; i <= s.length() - 1; i += 2) {
            s2 += s.charAt(i);
        }
        System.out.println(s2);
    }
}
