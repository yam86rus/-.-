package Chapter9;

//9.31. Из слова вирус путем замены его букв получить слово фокус.
public class Ex9_31 {
    public static void main(String[] args) {
        String str = "вирус"; // фокус
        String str2 = str.
                replace('в', 'ф').
                replace('и','о').
                replace('р','к');
        System.out.println(str2);
    }
}
