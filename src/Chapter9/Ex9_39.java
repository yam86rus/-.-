package Chapter9;
//9.39. Дано слово. Переставить первые три и последние три буквы, сохранив порядок их следования. Задачу решить двумя способами:
//        1) без использования оператора цикла;
//        2) с использованием оператора цикла.

public class Ex9_39 {
    public static void main(String[] args) {
        String s = "Задание";
        String endword = s.substring(s.length()-3);
        String beginword = s.substring(0,3);
        String s2 = endword + s.substring(3).replace(endword,beginword);
        System.out.println(s + "\n" + s2);

    }
}
