package Chapter9;

//9.64. Дано предложение. Определить, сколько в нем одинаковых соседних букв.
public class Ex9_64 {
    public static void main(String[] args) {
        String s = "Дано преедлоожениееееее";
        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (i == s.length() - 1) {
                break;
            } else if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
        }
        System.out.println("Повторы букв " + count);
    }

}
