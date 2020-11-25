package Chapter9;

//9.87. Дана последовательность слов. Проверить, правильно ли в ней записаны бук-восочетания ча и ща. Исправить ошибки.
public class Ex9_87 {
    public static void main(String[] args) {
        String s = "Тучя закрыла солнце. Перед грозой наступила тишина. Не кричят грачи. Не стучят дятлы. Не трещят сороки.";
        System.out.println(s);
        s = s.replace("чя", "ча").replace("щя","ща");
        System.out.println(s);
    }
}
