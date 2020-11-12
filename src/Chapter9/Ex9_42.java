package Chapter9;

//9.42. Составить программу, которая печатает заданное слово, начиная с последней буквы.
public class Ex9_42 {
    public static void main(String[] args) {
        String s = "ненавистная работа";
//        System.out.println(new StringBuilder(s).reverse()); // ez
        int i = s.length()-1;
        for (; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
