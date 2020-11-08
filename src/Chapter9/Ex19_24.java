package Chapter9;
//9.24. Из слова яблоко путем "вырезок" и "склеек" его букв получить слова блок
//        и око.
public class Ex19_24 {
    public static void main(String[] args) {
        String str = "яблоко";
        String str1 = str.substring(1,5);
        String str2 = str.substring(3);
        System.out.println(str1 + " " + str2);
    }
}
