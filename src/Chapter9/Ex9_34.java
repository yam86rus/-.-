package Chapter9;
//9.34. Из слова строка путем замены его букв получить слово строфа.

public class Ex9_34 {
    public static void main(String[] args) {
        String str = "строка";
        String str2 = str.replace('к','ф');
        System.out.println(str2);
    }
}
