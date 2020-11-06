package Chapter9;

//9.18. Даны два слова. Верно ли, что первое слово начинается на ту же букву,
// на ко-торую заканчивается второе слово?
public class Ex9_18 {
    public static void main(String[] args) {
        String str1 = "Первое слово";
        String str2 = "Второе слово";
        boolean result = (str1.toLowerCase().charAt(0) == str2.toLowerCase().charAt(str2.length() - 1)) ? true : false;
        System.out.println(result);
    }
}
