package Chapter9;

import java.util.Arrays;

//9.164. Дано предложение из 10 слов. Заполнить ими массив из 10 элементов.
public class Ex9_164 {
    public static void main(String[] args) {
        String s = "С другой стороны дальнейшее развитие различных форм деятельности позволяет выполнять";
        String[] array = s.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
