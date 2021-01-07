package Chapter9;

//9.170. Дано предложение. Найти какое-нибудь его слово, начинающееся на букву к.
public class Ex9_170 {
    static void foo(String str) {
        String [] arr = str.split(" ");
        for (String s: arr){
            if(s.startsWith("к")){
                System.out.println(s);
                break;
            }
        }
    }
    public static void main(String[] args) {
        String s = "Найти какое-нибудь его слово, начинающееся на букву к";
        foo(s);
    }
}
