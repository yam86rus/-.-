package Chapter9;
//9.75. Дано предложение. Напечатать все его символы, предшествующие первой
//          запятой. Рассмотреть два случая
//          1) известно, что в предложении запятые имеются;
//          2) в предложении запятых может не быть.


public class Ex9_75 {
    public static void main(String[] args) {
        String s = "Дано предложение. Напечатать все его символы, предшествующие первой запятой.";
        if (s.contains(",")) {
            System.out.println(s.substring(0,s.indexOf(',')));
        } else {
            System.out.println(s);
        }
    }
}
