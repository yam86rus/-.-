package Chapter9;

//9.68. Дан текст. Подсчитать общее число вхождений в него символов "+" и "–".
public class Ex9_68 {
    public static void main(String[] args) {
        String s1 = "Дан++ -текст-. +Подсчитать+ ++общее- число";
        int a = s1.length() - s1.replace("+", "").replace("-", "").length();
        System.out.println("Число символов в строке " + s1 + " = " + s1.length());
        System.out.println("Общее число знаков + и - " + a);
    }

}
