package Chapter9;
//9.132. Дано слово. Переставить его последнюю букву на место первой. При этом первую, вторую, ...,
//        предпоследнюю буквы сдвинуть вправо на одну по- зицию.
public class Ex9_132 {
    public static void main(String[] args) {
        String s = "Фундаментальный";
        System.out.println(s);
        String s1 = s.charAt(s.length()-1)+s.substring(0,s.length()-1);
        System.out.println(s1);
    }
}
