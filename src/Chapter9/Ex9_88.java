package Chapter9;

//9.88. Дано предложение. Напечатать все символы, расположенные между первой и второй запятой. Если второй запятой нет, то должны быть напечатаны все символы,
//        расположенные после единственной имеющейся запятой.
public class Ex9_88 {
    public static void main(String[] args) {
        String s = "Дано предложение. Напечатать все символы расположенные между первой и второй запятой.";
        int firstcomma = s.indexOf(",") + 1;
        int secondcomma = s.indexOf(",", firstcomma + 1) == -1 ? s.length() : s.indexOf(",", firstcomma + 1);
        System.out.println(s.substring(firstcomma, secondcomma));
    }
}
