package Chapter9;

//9.118. Дано слово стекляный_. Исправить ошибку в нем.
public class Ex9_118 {
    public static void main(String[] args) {
        String s = "стекляный";
        String s1 = new StringBuilder(s).replace(6, 6, "н").toString();
        System.out.println(s1);
    }
}
