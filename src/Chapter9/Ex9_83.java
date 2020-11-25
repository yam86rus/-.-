package Chapter9;
//9.83. Дано предложение. Определить количество букв н, предшествующих первой запятой предложения.
//          Рассмотреть два случая:
//        1) известно, что запятые в предложении есть;
//        2) запятых в предложении может не быть.
public class Ex9_83 {
    public static void main(String[] args) {
        String s = "Дано предложение. Определить количество букв н, предшествующих первой запятой";
        String s1 = s.substring(0,s.indexOf(','));
        int count = s1.length()-s1.replace("н","").length();
        System.out.println(count);
    }
}
