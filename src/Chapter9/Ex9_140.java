package Chapter9;

//9.140. Дан текст. Определить количество цифр в нем.
public class Ex9_140 {
    public static int countDigits(String s){
        char[] array = s.toCharArray();
        int count = 0;
        for (char c: array){
            if (Character.isDigit(c)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Лишь 23111 особенности внутренней политики, превозмогая сложившуюся 3-х летнюю непростую экономическую ситуацию, описаны максимально подробно на 15-ти листах!";
        System.out.println(countDigits(s));
    }

}
