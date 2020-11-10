package Chapter9;

//9.41. Дано название футбольного клуба. Напечатать его на экране "столбиком".
public class Ex9_41 {

    public static void main(String[] args) {
        String club = "Спартак";

        for (int i = 0; i <= club.length()-1; i++) {
            System.out.println(club.charAt(i));
        }
    }
}
