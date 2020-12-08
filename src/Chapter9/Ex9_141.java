package Chapter9;

//9.141. Дан текст, в котором имеются цифры.
//        а) Найти их сумму.
//        б) Найти максимальную цифру.
public class Ex9_141 {
    public static int summDigits(String s) {
        char[] array = s.toCharArray();
        int summ = 0;
        for (char c : array) {
            if (Character.isDigit(c)) {
                summ += Character.getNumericValue(c);
            }
        }
        return summ;
    }

    public static void main(String[] args) {
        String s = "31337 Метод Character.isLetter() — в Java определяет, является ли указанное значение типа char буквой. 10) 20)";
        System.out.println(summDigits(s));
        // 3 + 1 + 3 + 3 + 7 + 1 + 0 + 2 + 0 = 20
    }
}
