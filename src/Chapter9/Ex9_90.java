package Chapter9;
//9.90. Дано предложение. Все буквы е в нем заменить буквой и.
public class Ex9_90 {
    public static void main(String[] args) {
        String s = "Дано предложение. Все буквы е в нем заменить буквой и.";
        s = s.replace('е','и');
        System.out.println(s);

    }
}
