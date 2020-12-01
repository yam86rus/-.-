package Chapter9;

//9.107. Дано слово. Поменять местами первую из букв а и последнюю из букв о.
//        Учесть возможность того, что таких букв в слове может не быть.
public class Ex9_107 {
    public static void main(String[] args) {
        String s = "Заболоченный";
        int n1 = s.toLowerCase().indexOf('а');
        int n2 = s.toLowerCase().lastIndexOf('о');
        if (n1 == -1 || n2 == -1) {
            System.out.println("В слове нет буквы а или о");
        } else {
            System.out.println(s);
            StringBuilder sb1 = new StringBuilder(s);
            sb1.replace(n1, n1 + 1, "о");
            sb1.replace(n2, n2 + 1, "а");
            System.out.println(sb1);
        }
    }
}
