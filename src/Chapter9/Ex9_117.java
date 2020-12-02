package Chapter9;

//9.117. Проверить, является ли некоторая символьная строка "перевертышем" (см. задачу 9.78)
//        после удаления из нее всех пробелов.
//        Последние симво-лы "_", полученные после удаления пробелов, не учитывать.
public class Ex9_117 {
    public static boolean isPalindrom(String s) {
        s = s.replace(" ", "").toLowerCase();
        return s.equals(new StringBuilder(s).reverse().toString()) ? true : false;
    }

    public static void main(String[] args) {
        String string = "АННА";
        System.out.println(isPalindrom(string));
    }
}
