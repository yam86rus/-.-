package Chapter9;

//9.139. Дан текст. Напечатать все имеющиеся в нем цифры.
public class Ex9_139 {
    public static void main(String[] args) {
        String s = "В 17-й провинции никого не пугает гитарный 6-ти струнный перебор";
        char[] array = s.toCharArray();
        for (int i = 0; i <= s.length() - 1; i++) {
            if (Character.isDigit(array[i])) {
                System.out.print(array[i]);
            }
        }
    }
}
