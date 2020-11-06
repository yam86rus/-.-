package Chapter9;

//9.20. Дано слово. Получить и вывести на экран буквосочетание,
// состоящее из его третьего и последнего символа.
public class Ex9_20 {
    public static void main(String[] args) {

        String str1 = "Пятница";
        String str2 = "" + str1.charAt(2) + str1.charAt(str1.length() - 1);
        System.out.println(str2);
    }
}
