package Chapter9;
//9.63. Дан текст. Сколько раз в нем встречается символ "+" и сколько раз символ "*"?

public class Ex9_63 {
    public static void main(String[] args) {
        int count1 = 0, count2 =0;
        String s = "Дан текс ++ Сколько в - нем --";
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i)=='+'){
                count1++;
            } else if (s.charAt(i)=='-'){
                count2++;
            }
        }
        System.out.println("Символ \"+\" встречается в тексте " + count1 + " раз/раза");
        System.out.println("Символ \"-\" встречается в тексте " + count2 + " раз/раза");
    }
}
