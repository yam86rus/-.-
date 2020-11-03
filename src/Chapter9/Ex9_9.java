package Chapter9;

//9.9. Даны две фамилии. Определить, какая из них длиннее.
public class Ex9_9 {
    static int showInfo(String s1, String s2) {
        int result = 0;
        if (s1.length() > s2.length()) {
            result = 1;
        } else if (s1.length() < s2.length()) {
            result = 2;
        } else {
            result = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "Иванов", s2 = "Сидоров";
        System.out.println("Более длинная фамилия " + showInfo(s1, s2) + "-я");
    }
}
