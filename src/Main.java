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
        Scanner loScanner = new Scanner(System.in);
        System.out.println("Please enter your full name in the format: Ivanov Ivan Ivanovich");

        //ФИО
        String loFullFio = loScanner.nextLine();

        Fio loFio = new Fio();
        //Получить Фамилию
        String lvSurname = loFio.getSurname(loFullFio);

        //Получить Имя
        String lvName = loFio.getName(loFullFio);

        //Получить Отчество
        String lvPatronymic = loFio.getPatronymic(loFullFio);

        System.out.println("Surname: " + lvSurname);
        System.out.println("Name: " + lvName);
        System.out.println("Patronymic: " + lvPatronymic);
    }
}