package Chapter9;
//9.180. Даны два предложения. Для каждого слова первого предложения
//        (в том чис-ле для повторяющихся в этом предложении слов) определить, входит ли оно во второе предложение.
public class Ex9_180 {
    public static void main(String[] args) {
        String str1="Первое слово второе слово. Четвертое и пятое слова.";
        String str2="Шестое слово седьмое и восьмое";
        for(String s: str1.split(" ")){
            System.out.print(str2.contains(s) + " ");
        }
    }
}
