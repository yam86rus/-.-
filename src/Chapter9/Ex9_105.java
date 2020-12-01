package Chapter9;

//9.105. Дано слово из 12-ти букв. Переставить в обратном порядке буквы, располо-женные между второй
// и десятой буквами (т. е. с третьей по девятую).
public class Ex9_105 {
    public static void main(String[] args) {
        String s = "Авторитетный";
        System.out.println(s);
        StringBuffer sb1 = new StringBuffer(s);
        StringBuffer sb2 = new StringBuffer(sb1.substring(1,9));
        System.out.println("" + sb1.charAt(0)+sb2.reverse()+sb1.substring(9));
    }
}
