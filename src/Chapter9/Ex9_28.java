package Chapter9;

//9.28. Из слова трос путем "вырезок" и "склеек" его букв получить слова сорт, рост и торс.
public class Ex9_28 {
    public static void main(String[] args) {
        String str = "трос";
        String str1 = new StringBuilder(str).reverse().toString();
        String str2 = str.substring(1) + str.charAt(0);
        String str3 = "" + str.charAt(0) + str.charAt(2) + str.charAt(1) + str.charAt(3);
        System.out.println(str1 + " " + str2 + " " +  str3);
    }
}
