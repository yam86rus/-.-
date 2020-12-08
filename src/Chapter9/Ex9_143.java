package Chapter9;

//9.143. Дан текст. Определить, является ли он правильной десятичной записью це-
//        лого числа.
public class Ex9_143 {
    public static void main(String[] args) {
        String s = "f";
        int f1 = 0;
        try {
            f1 = Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(f1);
    }
}
