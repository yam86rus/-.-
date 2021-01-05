package Chapter9;

//9.167. Дано предложение. Напечатать все его слова, отличные от слова привет.
public class Ex9_167 {
    public static void main(String[] args) {
        String s = "Напечатать все его слова, отличные от слова привет";
        System.out.print(s);
        System.out.println();
        String[] ar = s.split(" ");
        for (String s1 : ar) {
            if (s1.equals("привет") ) {
                continue;
            } else {
                System.out.print(s1 + " ");
            }
        }
    }
}
