package Chapter9;

//9.162. Даны три слова. Напечатать их общие буквы. Повторяющиеся буквы каждо-го слова не рассматривать.
public class Ex9_162 {
    static String repeat(String str1, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (str2.contains("" + str1.charAt(i)) && str3.contains("" + str1.charAt(i))) {
                sb.append(str1.charAt(i));
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str1.contains("" + str2.charAt(i)) && str3.contains("" + str2.charAt(i))) {
                sb.append(str2.charAt(i));
            }
        }
        for (int i = 0; i < str3.length(); i++) {
            if (str2.contains("" + str3.charAt(i)) && str1.contains("" + str3.charAt(i))) {
                sb.append(str3.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "Новый Год";
        String s2 = "Дед морозГ";
        String s3 = "СнегурочГка";
        System.out.println((repeat(s1, s2, s3)));
    }
}
