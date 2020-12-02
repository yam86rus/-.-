package Chapter9;

//9.119. Дана фраза ценая вещь_. Исправить ошибку в ней.
public class Ex9_119 {
    public static void main(String[] args) {
        String s = "ценая вещь";
//        s = s.replace("ен", "енн"); // 1 способ
        s = new StringBuilder(s).replace(2, 2, "н").toString(); // 2 способ
        System.out.println(s);
    }
}
