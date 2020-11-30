package Chapter9;

//9.99. Символьной строке s по ошибке вместо опечатка присвоено значение очепатка.
//        Изменить значение s так, чтобы ошибки не было.
public class Ex9_99 {
    public static void main(String[] args) {
        String s = "очепатка";
        s = "опечатка";
        System.out.println(s);
    }
}
