package Chapter9;

//9.98. Дано предложение. Заменить в нем все вхождения подстроки s1 на подстро-ку s2.
public class Ex9_98 {
    public static void main(String[] args) {
        String s = "Дано предложение. Заменить в ам нем все вхождения подстроки s1 на подстро-ку s2.";
        System.out.println(s);
        String s1 = "ам";
        String s2 = "ноно";
        String s3 = s.replace(s1, s2);
        System.out.println(s3);
    }
}
