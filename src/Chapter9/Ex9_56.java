package Chapter9;

//9.56. Дано предложение. Вывести все имеющиеся в нем буквосочетания нн.
public class Ex9_56 {
    public static void main(String[] args) {
        String s = "банный манник";
        int count = 0;

//        System.out.println(s.indexOf("нн"));
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == 'н' && s.charAt(i + 1) == 'н') {
                count++;
            }
        }
        System.out.println(count);
        for (int i=0; i<=count-1; i++){
            System.out.print("нн ");
        }

    }
}
