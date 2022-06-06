import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "ivaniv";
        String middleName = "ivanovic";
        String lastName = "ivanov";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);

        System.out.println("Задание 2");
        String fullNameUp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудник - ");

        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович";
        System.out.println(Arrays.toString(fullName.split("")));
        String [] b = fullName.split("");

        for (int i=0; i<b.length; i++){
            String new_string ="";
            for (int j=0; j<b[i].length();j++){
                if(b[i].charAt(j) =='ё'){
                    new_string +='e';
                }
                else
                    new_string += b[i].charAt(j);


            }
            System.out.println(new_string);
        }
    }
}