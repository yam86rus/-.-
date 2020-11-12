package Chapter9;

//9.50. Даны два слова (первое длиннее второго).
//        Заменить во втором слове соответствующее количество символов на первое слово.
public class Ex9_50 {
    public static void main(String[] args) {
        String str1 = "Молоко";
        String str2 = "Сыр";
        String str3 = new StringBuilder(str1).
                delete(str2.length(), str1.length()).
                toString();
        str2 = str3;
        System.out.println(str2);
    }
}
