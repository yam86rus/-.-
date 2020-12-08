package Chapter9;
//9.145. Дан текст, имеющий вид: "d1 d2 ... dn " , где di — цифры (n > 1). Вычис-
//        лить записанную в тексте сумму.
public class Ex9_145 {
    public static void main(String[] args) {
        String s = "1   4              6  54 1";
        s = s.replaceAll("[\\s]{2,}", " ");
        s = s.replaceAll("[\\s]{2,}", " ");
        System.out.println(s);
        String[] array = s.split(" ");
        int result = 0;
        for (String s1: array){
            result +=Integer.parseInt(s1);
        }
        System.out.println(result);
    }
}
