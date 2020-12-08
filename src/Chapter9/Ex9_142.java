package Chapter9;

//9.142. Дан текст, в начале которого имеются пробелы и в котором имеются цифры.
//        Найти порядковый номер максимальной цифры, начиная счет с первого сим-
//        вола, не являющегося пробелом. Если максимальных цифр несколько, то
//        должен быть найден номер первой из них.
public class Ex9_142 {
    public static int[] foo(String s) {
        int result = 0;
        s = s.trim();
        int number = 0;
        int possition = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i <= array.length - 1; i++) {
            if (Character.isDigit(array[i])) {
                if (Character.getNumericValue(array[i]) > number) {
                    number = Character.getNumericValue(array[i]);
                    possition = i;
                }
            }
        }
        return new int[] {
            number, possition
        } ;
    }

    public static void main(String[] args) {
        String s = "  Дан текс 3 и цифры 8 и снова текст 3 5 8";
        System.out.println(s);
        int [] a = foo(s);
        System.out.println("Максимальная цифра " + a[0]);
        System.out.println("Индекс максмального числа " + a[1]);
    }
}
