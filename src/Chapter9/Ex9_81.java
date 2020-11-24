package Chapter9;

//9.81. Даны два слова. Определить, сколько начальных букв первого слова совпада-ет с начальными буквами второго слова.
//        Рассмотреть два случая:
//        1) известно, что слова разные;
//        2) слова могут быть одинаковыми.
public class Ex9_81 {
    public static void main(String[] args) {
        String str1 = "первый";
        String str2 = "пеппппппо";
        int count = 0;
        int i=0;
        while (str1.substring(i,i+1).equals(str2.substring(i,i+1))){
            count++;
            i++;
        }

        System.out.println(count);
    }
}
