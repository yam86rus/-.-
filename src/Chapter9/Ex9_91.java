package Chapter9;
//9.91. Дано предложение. Все пробелы в нем заменить символом "_".
public class Ex9_91 {
    public static void main(String[] args) {
        String s = "Дано предложение. Все пробелы в нем заменить символом \"_\".";
        System.out.println(s.replace(' ','_'));
    }
}
