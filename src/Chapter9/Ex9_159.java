package Chapter9;

//9.159. Даны два слова. Напечатать только те буквы слов, которые встречаются в обоих словах только один раз.
//        Например, если заданные слова процессор и информация, то ответом должно быть: п е ф м а я.
public class Ex9_159 {
    static void foo1(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (!str2.contains("" + str1.charAt(i)) && (str1.length() - str1.replace("" + str1.charAt(i), "").length()) < 2) {
                sb.append(str1.charAt(i));
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            if (!str1.contains("" + str2.charAt(i)) && (str2.length() - str2.replace("" + str2.charAt(i), "").length()) < 2) {
                sb.append(str2.charAt(i));
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String s1 = "процессор";
        String s2 = "информация";
        foo1(s1, s2);
    }
}
