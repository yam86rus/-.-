package Chapter9;

//9.10. Даны названия трех городов. Вывести на экран самое длинное и самое короткое название.
public class Ex9_10 {
    static void showInfo(String s1, String s2, String s3) {
        String[] array = {s1, s2, s3};
        int max = s1.length();
        int min = s1.length();
        String maxCity = s1;
        String minCity = s1;
        for (int i = 1; i <= 2; i++) {
            if (array[i].length()>max) {
                max = array[i].length();
                maxCity = array[i];
            }
            if (array[i].length()<min){
                min = array[i].length();
                minCity = array[i];
            }
        }
        System.out.println("Самое длинное слово " + maxCity);
        System.out.println("Самое короткое слово " + minCity);

    }

    public static void main(String[] args) {
        String s1 = "Сургут", s2 = "Новосибирск", s3 = "Омск";
        showInfo(s1, s2, s3);
    }
}
