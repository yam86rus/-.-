package Chapter9;
//9.48. Дано слово. Добавить к нему в начале четыре символа "+" и в конце — пять символов "–".
public class Ex9_48 {
    public static void main(String[] args) {
        String s = "Слово";
        // первый вариант
        // String s1 = new StringBuilder(s).append("-----").reverse().append("++++").reverse().toString();

        // второй вариант
        String s1 = new StringBuilder(s).append("-----").insert(0,"++++").toString();
        System.out.println(s1);

    }
}
