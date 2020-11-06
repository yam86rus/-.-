package Chapter9;

//9.17. Дано слово. Верно ли, что оно начинается и оканчивается на одну и ту же букву?
public class Ex9_17 {
    public static void main(String[] args) {
        String s = "Агина";
        System.out.println(s.toLowerCase().charAt(0) == s.toLowerCase().charAt(s.length() - 1));
    }
}
