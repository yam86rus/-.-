package Chapter9;
//9.138. Дан символ. Выяснить, является ли он цифрой.
public class Ex9_138 {
    public static void main(String[] args) {
        char c1 = 'f';
        char c2 = '1';

        System.out.println("\'" + c1 + "\' цифра? ответ: " + Character.isDigit(c1));
        System.out.println("\'" + c1 + "\' буква? ответ: " + Character.isLetter(c1));
    }
}
