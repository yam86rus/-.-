package Chapter9;
//9.12. Составить программу обмена значениями трех переменных величин а, b, c
//        строкового типа по следующей схеме:
//а) b присвоить значение c, а присвоить значение b, c присвоить значение а;
//б) b присвоить значение а, с присвоить значение b, а присвоить значение c.

public class Ex9_12 {
    public static void main(String[] args) {
        String a = "строка a";
        String b = "строка b";
        String c = "строка c";
        String sandBox = a;
        a = c;
        c = b;
        b = sandBox;
        System.out.println(a + " " + b + " " + c);
    }

}
