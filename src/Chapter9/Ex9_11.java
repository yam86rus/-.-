package Chapter9;
//9.11. Даны названия двух стран. Присвоить эти названия переменным величинам s1
//        и s2, после чего обменять значения величин s1 и s2.

public class Ex9_11 {
    public static void main(String[] args) {
        String s1 = "Россия", s2 = "Испания";
        String s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1 + " " + s2);
    }
}
