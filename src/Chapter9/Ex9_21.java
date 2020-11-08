package Chapter9;
//9.21. Дано слово. Получить его часть, образованную второй, третьей и четвертой
//        буквами.

public class Ex9_21 {
    public static void main(String[] args) {
        String str = "Понедельник"; // оне
        String str1 = str.substring(1,4);
        System.out.println(str1);
    }
}
