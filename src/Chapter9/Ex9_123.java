package Chapter9;
//Дано предложение, оканчивающееся символом "_".
//        Вставить заданную бук-ву перед последней буквой и.
public class Ex9_123 {
    public static void main(String[] args) {
        String s = "Дано предложение, оканчивающееся символом_";
        StringBuilder sb = new StringBuilder(s);
        int a = sb.lastIndexOf("и");
        sb.replace(a,a,"X");
        sb.replace(sb.length()-1,sb.length(),"");
        System.out.println(sb);

    }
}
