package Chapter9;

//Дана последовательность слов. Напечатать те слова последовательности, ко-торые отличны
//        от первого слова и удовлетворяют следующему свойству:
//        а) в слове нет повторяющихся букв;
//                б) слово симметрично.
public class Ex9_179 {
    static boolean isPalinom(String s) {
        return (new StringBuilder(s).reverse().toString().equals(s)) ? true : false;
    }

    static void foo(String[] ar) {
        for (String str : ar) {
            if (isPalinom(str)) {
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"анна", "те", "еле-еле", "последовательности", "напечатать", "анна"};
        foo(arr);
    }
}
