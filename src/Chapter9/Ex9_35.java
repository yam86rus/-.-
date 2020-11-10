package Chapter9;

//9.35. Из слова муха путем замены его букв получить слово слон.
public class Ex9_35 {
    public static void main(String[] args) {
        String s = "муха";
        s = s.replace("муха", "слон");
        System.out.println(s);
    }
}
