package Chapter9;

//9.33. Из слова пробел путем замены его букв получить слово продел.
public class Ex9_33 {
    public static void main(String[] args) {
        String str = "пробел";
        String str2 = str.replace('б', 'д');
        System.out.println(str2);
    }
}
