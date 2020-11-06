package Chapter9;
//9.19. Дано слово. Получить и вывести на экран буквосочетание, состоящее из его второго
// и четвертого символа.
public class Ex9_19 {
    public static void main(String[] args) {
        String str = "Случайное слово";
        String str2 = "" + str.charAt(1) + str.charAt(3);
        System.out.println(str2);
    }
}
