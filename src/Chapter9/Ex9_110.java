package Chapter9;

//9.110. Дано слово.
//        а) Удалить из него первую из букв о, если такая буква есть.
//        б) Удалить из него последнюю из букв л, если такая буква есть.
public class Ex9_110 {
    public static void main(String[] args) {
        String s = "Единоборство";
        String s1 = "Металлолом ";
        System.out.println(s.replaceFirst("о",""));
        String s2 = new StringBuilder(s1).reverse().toString().replaceFirst("л","");
        StringBuilder sb = new StringBuilder(s2).reverse();
        System.out.println(sb);
    }
}
