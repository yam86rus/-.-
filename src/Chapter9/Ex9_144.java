package Chapter9;

//9.144. Дан текст, представляющий собой десятичную запись целого числа. Вычис-
//        лить сумму цифр этого числа.
public class Ex9_144 {
    public static int parse(String s) {
        int result = 0;
        try {
            result = Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }

    public static int summ(int a) {
        int result = 0;
        while (a > 0) {
            result += a % 10;
            a /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "1234";
        int a = parse(s);
        System.out.println(summ(a));
    }
}
