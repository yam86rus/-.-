package Chapter9;

//9.124. Путем вставок и удаления символов исправить ошибки:
//        а) в слове прроцесор;
//        б) во фразе теекстовыйфайл;
//        в) во фразе програма и аллгоритм;
//        г) во фразе процесор и паммять.
public class Ex9_124 {
    public static void main(String[] args) {
        String s = "прроцесор";
        s = s.replace("рр", "р");
        s = s.replace("с", "сс");
        System.out.println(s);

        String s1 = "теекстовыйфайл";
        s1 = s1.replace("ее", "е");
        String s2 = s1.substring(0, s1.indexOf("файл")) + " " + s1.substring(s1.indexOf("файл"));
        System.out.println(s2);

        String s3 = "програма и аллгоритм";
        s3 = s3.replace("ама", "амма");
        s3 = s3.replace("лл", "л");
        System.out.println(s3);

        String s4 = "процесор и паммять";
        s4 = s4.replace("процесор", "процессор");
        s4 = s4.replaceFirst("м","");
        System.out.println(s4);

    }
}
