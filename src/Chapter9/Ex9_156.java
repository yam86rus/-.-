package Chapter9;

//9.156. Даны два слова. Для каждой буквы первого слова (в том числе для повто-ряющихся в этом слове букв) определить,
//        входит ли она во второе слово. Например, если заданные слова информация и процессор, то для букв перво-го из
//        них ответом должно быть: нет нет нет да да нет нет да нет нет.
public class Ex9_156 {
    void foo1(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            if (str2.contains("" + str1.charAt(i))) {
                System.out.print("Да ");
            } else {
                System.out.print("Нет ");
            }
        }
    }


    public static void main(String[] args) {
        String s1 = "информация";
        String s2 = "процессор";
        Ex9_156 test1 = new Ex9_156();
        test1.foo1(s1, s2);

    }
}
