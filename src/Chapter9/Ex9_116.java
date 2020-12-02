package Chapter9;

//9.116. Проверить, является ли "перевертышем" (см. задачу 9.78)
//          следующая сим-вольная строка после удаления из нее всех пробелов:
//        а) АРГЕНТИНА МАНИТ НЕГРА;
//        б) ПОТ КАК ПОТОП;
//        в) А РОЗА УПАЛА НА ЛАПУ АЗОРА.
//        Во всех задачах последние символы "_", полученные после удаления пробе-лов, не учитывать.
public class Ex9_116 {
    public static boolean isPalindrom(String s) {
        s = s.replace(" ", "");
        StringBuilder sb = new StringBuilder(s);
        return (s.equals(sb.reverse().toString())) ? true : false;
    }

    public static void main(String[] args) {
        String s1 = "АРГЕНТИНА МАНИТ НЕГРА";
        String s2 = "ПОТ КАК ПОТОП";
        String s3 = "А РОЗА УПАЛА НА ЛАПУ АЗОРА";
        System.out.println(isPalindrom(s1));
        System.out.println(isPalindrom(s2));
        System.out.println(isPalindrom(s3));
    }
}
