package Chapter9;
//9.36. Из слова тетрадь путем замены его букв получить слово дневник.

public class Ex9_36 {
    public static void main(String[] args) {
        String s = "тетрадь";
        s = s.replace("тетрадь", "дневник");
        System.out.println(s);
    }
}
