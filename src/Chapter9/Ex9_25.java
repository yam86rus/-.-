package Chapter9;

//9.25. Из слова информатика путем "вырезок" и "склеек" его букв получить слова
//        форма и тик.
public class Ex9_25 {
    public static void main(String[] args) {
        String str = "информатика";
        String str1 = str.substring(2, 7);
        String str2 = str.substring(7, 10);
        System.out.println(str1 + " " + str2);
    }
}
