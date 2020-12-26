package Chapter9;

//9.157. Даны два слова. Для каждой буквы первого слова определить, входит ли она во второе слово.
//        Повторяющиеся буквы первого слова не рассматривать. На-пример, если заданные слова
//        процессор и информация, то для букв первого из них ответом должно быть:
//        нет да да да нет нет.
public class Ex9_157 {
    static void foo(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (sb.indexOf(("" + str1.charAt(i))) == -1) {
                sb.append(str1.charAt(i));
            }
        }
        System.out.println(sb);
        System.out.println();

        System.out.printf(str2);;
        for (int i = 0; i < sb.length(); i++) {
            if (str2.contains("" + sb.charAt(i))) {
                System.out.print("Да ");
            } else {
                System.out.print("Нет ");
            }
        }
    }

    public static void main(String[] args) {
        String s1 = "процессор";
        String s2 = "информация";
        foo(s1, s2);
//        StringBuilder sb = new StringBuilder(s1);
//        System.out.println(sb.indexOf("ц"));
    }
}
