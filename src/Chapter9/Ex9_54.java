package Chapter9;
//9.54. Дано предложение. Вывести все буквы м и н в нем.
public class Ex9_54 {
    public static void main(String[] args) {
        String s = "Дано предлоежение";
        for (int i = 0; i<=s.length()-1;i++){
            char c1 = s.charAt(i);
            if (c1 =='е' || c1 == 'н'){
                System.out.println(s.charAt(i));
            }
        }
    }
}
