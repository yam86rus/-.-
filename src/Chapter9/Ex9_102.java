package Chapter9;

//9.103. Дано слово из четного числа букв. Поменять местами первую букву со вто-рой, третью — с четвертой и т. д.
public class Ex9_102 {
    public static void main(String[] args) {
        String s = "Поменять";
        System.out.println(s);
        char[] charArray = s.toCharArray();
//        012345
//        103254
        for (int i = 1; i <= s.length() - 1; i += 2) {
            System.out.print("" + charArray[i] + charArray[i - 1]);

        }
    }
}
