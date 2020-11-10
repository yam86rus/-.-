package Chapter9;
//9.22. Дано слово, состоящее из четного числа букв. Вывести на экран его первую
//        половину, не используя оператор цикла.
public class Ex9_22 {
    public static void main(String[] args) {
        String str = "улитка";
        System.out.println(str.substring(0,str.length()/2));
    }
}
