import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//***
//        Напишите программу, которая на входе через консоль принимает фамилию,
//        имя и отчество одной строкой (например, «Иванов Сергей Петрович»)
//        и выводит фамилию, имя и отчество отдельно в формате:
//        Фамилия: Иванов
//        Имя: Сергей
//        Отчество: Петрович
//***
        final String LC_SURNAME = "Surname";
        final String LC_NAME = "Name";
        final String LC_PATRONYMIC = "Patronymic";

        Scanner loScanner = new Scanner(System.in);
        System.out.println("Please enter your full name in the format: Ivanov Ivan Ivanovich");

        //ФИО
        String loFullFio = loScanner.nextLine();

        Fio loFio = new Fio();
        //Получить Фамилию
        String lvSurname = loFio.separFio(loFullFio, LC_SURNAME);

        //Получить Имя
        String lvName = loFio.separFio(loFullFio, LC_NAME);

        //Получить Отчество
        String lvPatronymic = loFio.separFio(loFullFio, LC_PATRONYMIC);

        System.out.println("Surname: " + lvSurname);
        System.out.println("Name: " + lvName);
        System.out.println("Patronymic: " + lvPatronymic);
    }
}