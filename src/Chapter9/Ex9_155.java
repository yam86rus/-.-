package Chapter9;

//9.155. В слове имеются только две одинаковых буквы. Найти их.
public class Ex9_155 {
    static String foo(String str) {
        int result = 0;
        String res = null;
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    result++;
                }

            }
            if (result == 2) {
                res = "" + str.charAt(i);
                break;
            } else {
                result = 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "Многоголосая";
        System.out.println(foo(s));

    }
}
