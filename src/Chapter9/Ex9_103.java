package Chapter9;

//9.104. Дано слово из четного числа букв. Поменять местами его половины сле-дующим способом: первую букву
//        поменять с последней, вторую — с пред-последней и т. д.
public class Ex9_103 {
    public static void main(String[] args) {
        String s = "Поменять";
        StringBuilder sb1 = new StringBuilder(s);
        System.out.println(sb1.reverse());

    }
}
