package Chapter9;

//9.82. Дано предложение, в котором нет символа "-". Определить количество букв о в первом слове.
//        Учесть, что в начале предложения могут быть пробелы.
public class Ex9_82 {
    public static void main(String[] args) {
        String s = "   Дано предложение, в котором нет символа";
        s = s.trim();
        s = s.substring(0, s.indexOf(" "));
        int count = s.length() - s.replace("о", "").length();
        System.out.println("в слове \"" + s + "\" букв \"о\" = " + count);
    }
}
