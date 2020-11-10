package Chapter9;

//9.26. Из слова вертикаль путем "вырезок" и "склеек" его букв получить слова тир
//        и ветка.
public class Ex9_26 {
    public static void main(String[] args) {
        String str = "вертикаль";
        String str1 = str.substring(3, 5) + str.charAt(2);
        String str2 = str.substring(0, 2) + str.charAt(3) + str.substring(5, 7);
        System.out.println(str1 + " " + str2);
    }
}
