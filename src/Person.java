public class Person {
    public static String Fio(String surname, String name, String patronymic) {
        return surname+" "+name.charAt(0)+"."+patronymic.charAt(0)+".";
    }
    public static String Fio(String surname) {
        return surname;
    }
    public static String Fio(String surname, String name) {
        return surname+" "+name.charAt(0)+".";
    }
}
