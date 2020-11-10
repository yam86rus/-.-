package Chapter9;
//9.29. Из слова клоун путем "вырезок" и "склеек" его букв получить слова уклон, кулон и колун.
public class Ex9_29 {
    public static void main(String[] args) {
        String str1 = "клоун";
        String str2 = "" + str1.charAt(3) + str1.substring(0,3) + str1.charAt(4);
        String str3 = "" + str1.charAt(0) + str1.charAt(3) + str1.substring(1,3) + str1.charAt(4);
        String str4 = "" + str1.charAt(0) + str1.charAt(2) + str1.charAt(1) + str1.substring(3,5);

        System.out.println(str2 + " " + str3 + " " + str4);
    }
}
