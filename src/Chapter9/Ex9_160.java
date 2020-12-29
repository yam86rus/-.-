package Chapter9;

//9.160. Даны два слова. Определить, можно ли из букв первого из них получить второе. Рассмотреть два варианта:
//        1) повторяющиеся буквы второго слова могут в первом слове не повторяться;
//        2) каждая буква второго слова должна входить в первое слово столько же раз, сколько и во второе.
public class Ex9_160 {
    static boolean foo1(String str1, String str2) {
        boolean result = true;
        for (int i = 0; i < str1.length(); i++) {
            if (!str2.contains(""+str1.charAt(i))){
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "абв";
        String s2 = "авбааа";
        System.out.println(foo1(s1, s2));

    }
}
