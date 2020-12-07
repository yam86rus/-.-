package Chapter9;

//9.137. Дано слово из 12-ти букв. Переставить его буквы следующим способом:
//        пер-вая, двенадцатая, вторая, одиннадцатая, ..., пятая, восьмая, шестая, седьмая.
public class Ex9_137 {
    public static void main(String[] args) {
        String s = "Еженедельник";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= s.length() / 2 - 1; i++) {
            sb.append(s.charAt(i));
            sb.append(s.charAt(11 - i));
        }
        System.out.println(s);

    }
}
