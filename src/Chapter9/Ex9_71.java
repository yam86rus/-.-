package Chapter9;

//9.71. Дано предложение. Определить, каких букв в нем больше: м или н.
public class Ex9_71 {
    public static void main(String[] args) {
//        String s = "Дано предложение. Определить, каких букв в нем больше: м или н";
        String s = "ммннн";
        int countM = 0, countN = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == 'м') {
                countM++;
            } else if (s.toLowerCase().charAt(i) == 'н') {
                countN++;
            }
        }
        if (countM > countN) System.out.println("Больше м");
        if (countM < countN) System.out.println("Больше н");
        if (countM == countN) System.out.println("M и N - равны");
    }
}
