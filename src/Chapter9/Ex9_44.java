package Chapter9;
//9.44. Дано слово s. Получить слово t, получаемое путем прочтения слова s начиная с его конца.
public class Ex9_44 {
    public static void main(String[] args) {
        String s = "Слово";
        String t = new StringBuilder(s).reverse().toString();
        System.out.println(t);
    }
}
