package Chapter9;

//9.37. Дано слово из четного числа букв. Поменять местами его половины. Задачу
//        решить двумя способами:
//        1) без использования оператора цикла;
//        2) с использованием оператора цикла.
public class Ex9_37 {
    public static void main(String[] args) {
        String s = "машина";
        s = s.substring(s.length() / 2) + s.substring(0, s.length() / 2);
        System.out.println(s);
    }
}
