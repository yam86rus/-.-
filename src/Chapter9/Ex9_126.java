package Chapter9;

//9.126. Дано слово. Переставить его первую букву на место последней.
//        При этом вторую, третью, ..., последнюю буквы сдвинуть влево на одну позицию.
public class Ex9_126 {
    public static void main(String[] args) {
        String s = "Разнообразиться";
        System.out.println(s);
        s = s.substring(1) + s.charAt(0);
        System.out.println(s);
    }
}
