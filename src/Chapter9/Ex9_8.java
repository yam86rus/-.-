package Chapter9;

//9.8. Дано название города. Определить, четно или нет количество символов в нем.
public class Ex9_8 {
    public static void main(String[] args) {
        String city = "Сургут";
        int n = city.length();
        String result = (n % 2 == 0) ? "Четное количество" : "Не четное количество";
        System.out.println(result);
    }
}
