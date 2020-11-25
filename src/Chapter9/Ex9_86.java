package Chapter9;
//9.86. Дана последовательность слов. Проверить, правильно ли в ней записаны бук-восочетания жи и ши.
public class Ex9_86 {
    public static void main(String[] args) {
        String s = "Дана последовательность слов. Проверить, правильно ли в ней записаны бук-восочетания жи и ши.";
        System.out.println("есть ошибки в жи " + s.contains("жы"));
        System.out.println("есть ошибки в ши " + s.contains("шы"));
    }
}
