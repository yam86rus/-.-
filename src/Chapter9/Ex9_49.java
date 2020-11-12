package Chapter9;

//9.49. Дано слово. Добавить к нему в начале и конце столько звездочек, сколько букв в этом слове.
public class Ex9_49 {
    public static void main(String[] args) {
        String s = "Слово";
        StringBuilder s1 = new StringBuilder(s);
        for (int i = 1; i <= s.length(); i++) {
            s1.insert(0,'*').append('*');
        }
        System.out.println(s1);
    }
}
