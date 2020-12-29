package Chapter9;

//9.161. Даны три слова. Напечатать только те буквы слов, которые есть лишь в од-ном из слов. Рассмотреть два варианта:
//        1) повторяющиеся буквы каждого слова рассматриваются;
//        2) повторяющиеся буквы каждого слова не рассматриваются.
public class Ex9_161 {

    static String foo1(String s1, String s2, String s3) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (!s2.contains("" + s1.charAt(i)) && !s3.contains("" + s1.charAt(i))) {
                sb.append(s1.charAt(i));
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (!s1.contains("" + s2.charAt(i)) && !s3.contains("" + s2.charAt(i))) {
                sb.append(s2.charAt(i));
            }
        }
        for (int i = 0; i < s3.length(); i++) {
            if (!s1.contains("" + s3.charAt(i)) && !s2.contains("" + s3.charAt(i))) {
                sb.append(s3.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "первое";
        String s2 = "второе";
        String s3 = "третье";
        System.out.println(foo1(s1, s2, s3));
    }
}
