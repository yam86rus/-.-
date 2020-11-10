package Chapter9;

//9.32. Из слова курсор путем замены его букв получить слово танцор.
public class Ex9_32 {
    public static void main(String[] args) {
        String str = "курсор"; // курсор -> танцор
        String str2 = str.replace("курс", "танц");
        System.out.println(str2);
    }
}
