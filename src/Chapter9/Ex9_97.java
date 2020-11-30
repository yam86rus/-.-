package Chapter9;
//9.97. Дано предложение. Заменить в нем все вхождения буквосочетания бит на рог.
public class Ex9_97 {
    public static void main(String[] args) {
        String s ="Дано предложение. Заменить в нем все вхождения буквосочетания бит на рог.";
        System.out.println(s);
        System.out.println(s.replace("бит","рог"));
    }
}
