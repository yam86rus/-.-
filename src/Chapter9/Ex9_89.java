package Chapter9;
//9.89. Дано предложение, в котором имеются одна буква с и одна буква Т.
//        Опреде-лить, какая из них встречается раньше (при просмотре слова слева направо).
public class Ex9_89 {
    public static void main(String[] args) {
        String s = "Дано предложение, в котором имеются одна буква с и одна буква Т. ";
        int n1 = s.indexOf("с");
        int n2 = s.indexOf("Т");
        String result = n1<n2 ? "c" : "Т";
        System.out.println("раньше буква " + result);
    }
}
