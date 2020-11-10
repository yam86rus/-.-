package Chapter9;

//9.27. Из слова программа путем "вырезок" и "склеек" его букв получить слова ром и рампа.
public class Ex9_27 {
    public static void main(String[] args) {
        String str = "программа";
        String str1 = str.substring(1, 3) + str.charAt(6);
        String str2 = str.substring(4, 7) + str.charAt(0) + str.charAt(8);
        System.out.println(str1 + " " + str2);
    }
}
