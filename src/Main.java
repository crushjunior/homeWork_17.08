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
        System.out.println();
        // Task 4
        String lastName4 = fullName.substring(0, fullName.indexOf(" "));
        String firstName4 = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
        String middleName4 =  fullName.substring(fullName.lastIndexOf(" ") + 1, fullName.length());
        System.out.println("Имя сотрудника — " + firstName4);
        System.out.println("Фамилия сотрудника — " + lastName4);
        System.out.println("Отчество сотрудника — " + middleName4);
        System.out.println();
        // Task 5
        String fullName5 = "ivanov ivan ivanovich";
        char[] fullNam = fullName5.toCharArray();
        fullNam[0] = Character.toUpperCase(fullNam[0]);
        for (int i = 0; i < fullNam.length; i++) {
            if (fullNam[i] == ' ') {
                fullNam[i + 1] = Character.toUpperCase(fullNam[i + 1]);
            }
        }
        fullName5 = new String(fullNam);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullName5);
        System.out.println();
        // Task 6
        String first = "135";
        String second = "246";
        int count = 0;
        int count2 = 0;
        StringBuilder sb = new StringBuilder();
        char[] first1 = first.toCharArray();
        char[] second2 = second.toCharArray();
        for (int i = 1; i <= first1.length + second2.length; i++) {
            if (i % 2 != 0) {
                sb.append(first1[count]);
                count2 ++;

            } else {
                sb.append(second2[count]);
                count2++;

            }
            if (count2 % 2 == 0) {
                    count ++;
            }

        }
        String sbResult = sb.toString();
        System.out.println("Данные строки — " + sbResult);
        System.out.println();
        // Task 7
        String words = "aabccddefgghiijjkk";
        StringBuilder sb7 = new StringBuilder();
        char[] arrWords = words.toCharArray();
        for (int i = 1; i < arrWords.length; i++) {
            if (arrWords[i] == arrWords[i - 1]) {
                sb7.append(arrWords[i]);
            }
        }
        String sbResult7 = sb7.toString();
        System.out.println(sbResult7);
    }
}