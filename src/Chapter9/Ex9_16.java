package Chapter9;
//9.16. Дано слово. Определить, одинаковы ли второй и четвертый символы в нем.
public class Ex9_16 {
    public static void main(String[] args) {
        String s = "Слоло";
        System.out.println(s.charAt(1)==s.charAt(3));
    }
}
