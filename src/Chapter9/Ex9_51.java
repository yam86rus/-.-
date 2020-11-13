package Chapter9;

//9.51. Дано предложение. Напечатать все его буквы и.
public class Ex9_51 {
    public static void main(String[] args) {
        String s = "предложение";
        for (int i = 0; i <= s.length()-1; i++) {
            if (s.charAt(i)=='и'){
                System.out.print(s.charAt(i));
            }
        }
    }
}
