package Chapter10;

//10.21. Даны два натуральных числа. Выяснить, является ли хоть одно из них па-
//        линдромом ("перевертышем"), т. е. таким числом, десятичная запись которо-
//        го читается одинаково слева направо и справа налево. (Определить функ-
//        цию, позволяющую распознавать числа-палиндромы.)
public class Ex10_21 {
    public static void main(String[] args) {
        int n1 = 12321, n2 = 1234;
        isPalindrom(n1);
        isPalindrom(n2);
    }

    private static void isPalindrom(int n1) {
        String str1 = String.valueOf(n1);
        String str2 = new StringBuilder(String.valueOf(n1)).reverse().toString();
        System.out.println(str1.equals(str2) ? true : false);
    }
}
