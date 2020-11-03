package Chapter9;

//9.7. Дано название футбольного клуба. Определить количество символов в нем.
public class Ex9_7 {
    public static void main(String[] args) {
        String club = "Спартак";
        int n = club.length();
        System.out.println("Количество символов в слове \"" + club + "\" = " + n);
    }
}
