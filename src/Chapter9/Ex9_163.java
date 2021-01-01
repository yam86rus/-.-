package Chapter9;

//9.163. Даны три слова. Напечатать неповторяющиеся в них буквы.
public class Ex9_163 {
    static void foo(String str1, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (!str2.contains("" + str1.charAt(i)) && !str3.contains("" + str1.charAt(i))) {
                sb.append(str1.charAt(i));
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            if (!str1.contains("" + str2.charAt(i)) && !str3.contains("" + str2.charAt(i))) {
                sb.append(str2.charAt(i));
            }
        }
        for (int i = 0; i < str3.length(); i++) {
            if (!str1.contains("" + str3.charAt(i)) && !str2.contains("" + str3.charAt(i))) {
                sb.append(str3.charAt(i));
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String s1 = "АБВ";
        String s2 = "ВГД";
        String s3 = "ДЕЁ";
        foo(s1, s2, s3);
    }
}
