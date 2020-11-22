package Chapter9;
//9.74. Дан текст. Верно ли, что в нем есть пять идущих подряд одинаковых символов?

public class Ex9_74 {
    public static void main(String[] args) {
        String s = "Дан текст. Верно ли, что в нем есть пять идущих подряд одинаковых символов? ааааа?";
        System.out.println(s.contains("верно?"));
        System.out.println(s.contains("ааааа"));
    }
}
