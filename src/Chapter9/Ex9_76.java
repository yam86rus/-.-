package Chapter9;
//9.76. Дано предложение, в котором имеется несколько букв е. Найти:
//        а) порядковый номер первой из них;
//        б) порядковый номер последней из них.

public class Ex9_76 {
    public static void main(String[] args) {
        String s = "Дано предложение, в котором имеется несколько букв е. Найти:";
        int first = s.indexOf('е');
        int last = s.lastIndexOf("е");
        System.out.println("Первая " + first + " последняя " + last);
    }
}
