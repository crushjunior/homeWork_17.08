public class Main {
    public static void main(String[] args) {
        // Task 1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName +" " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();
        // Task 2
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperFullName);
        System.out.println();
        // Task 3
        String fullName2 = "Иванов Семён Семёнович";
        String fullName3 = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName3);
    }
}