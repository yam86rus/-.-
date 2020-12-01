package Chapter9;

//9.108. Устранить имеющуюся в заданном слове ошибку:
//        а) дано слово глинянный;
//        б) дано слово граффика.
public class Ex9_108 {
    public static void main(String[] args) {
        String str1 = "глинянный";
        String str2 = "граффика";
        String str3 = str1.replace("нн", "н") + "_";
        String str4 = str2.replace("фф", "ф") + "_";
        System.out.println(str3 + "\n" + str4);
    }
}
