package Chapter9;
//9.78. Дано слово. Проверить, является ли оно "перевертышем"
//        (перевертышем называется слово, читаемое одинаково как с начала, так и с конца).
public class Ex9_78 {
    static void showInfo (String s){
        if (s.toLowerCase().equals(new StringBuilder(s).reverse().toString().toLowerCase())){
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
    public static void main(String[] args) {
        String str1 = "Кружка", str2 = "Анна";
        showInfo(str1);
        showInfo(str2);
    }
}
