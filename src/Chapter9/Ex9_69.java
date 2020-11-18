package Chapter9;
//9.69. Дан текст. Определить, сколько в нем предложений.
public class Ex9_69 {
    public static void main(String[] args) {
        String s = "Дан текст. Определить, сколько в нем предложений.";
        int a = s.length() - s.replace(".","").length();
        System.out.println(s);
        System.out.println("В этом тексте " + a + " предложений/я");
    }
}
