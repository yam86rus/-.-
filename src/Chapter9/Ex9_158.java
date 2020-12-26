package Chapter9;

//9.158. Даны два слова. Напечатать только те буквы слов, которые есть только в од-ном из них
//        (в том числе повторяющиеся). Например, если заданные слова процессор и информация,
//        то ответом должно быть: п е с с и ф м а я.
public class Ex9_158 {
    static void foo1(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (!s2.contains("" + s1.charAt(i))) {
                System.out.print(s1.charAt(i)+" ");
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (!s1.contains("" + s2.charAt(i))) {
                System.out.print(s2.charAt(i)+" ");
            }
        }
    }

    public static void main(String[] args) {
        String str1 = "процессор";
        String str2 = "информация";
        foo1(str1, str2);

    }
}
