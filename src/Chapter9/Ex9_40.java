package Chapter9;
//9.40. Дано слово. Перенести первые k его букв в конец.
//        Задачу решить двумя способами:
//        1) без использования оператора цикла;
//        2) с использованием оператора цикла.

public class Ex9_40 {
    public static void main(String[] args) {
        String s = "Слово";
        System.out.println(s);
        int n = 4;
        String s1 = s.substring(0,4);
        s = s.substring(n)+s1;
        System.out.println(s);
    }
}
